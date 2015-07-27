package de.leifaktor.gdxrobbie.entity;

import de.leifaktor.gdxrobbie.Direction;
import de.leifaktor.gdxrobbie.logic.Room;
import de.leifaktor.gdxrobbie.logic.tiles.Tile;

public abstract class Entity {
	
	/**
	 * The X-Coordinate of the field this entity is currently occupying.
	 */
	
	protected int x;
	
	/**
	 * The Y-Coordinate of the field this entity is currently occupying.
	 */
	
	protected int y;
	
	/**
	 * THe Z-Coordinate is the number of the layer this entity is currently in.
	 */
	
	protected int z;
	
	/**
	 * The room the entity is currently in
	 */
	
	protected Room room;
	
	/**
	 * The actual X-Coordinate of the entity
	 */
	
	protected float actualX;
	
	/**
	 * The actual Y-Coordinate of the entity
	 */
	
	protected float actualY;
	
	/**
	 * The walking speed, in Tiles per Tick.
	 */
	
	protected float walkingSpeed;
	
	/**
	 * The walking speed per coordinate, if the actor heads in a diagonal direction.
	 * It is the walkingSpeed * SQRT(2)
	 */
	
	protected float diagWalkingSpeed;
	
	/**
	 * The walking direction, according to de.leifaktor.gdxrobbie.Direction, a number from 0 to 7
	 */
	
	protected int direction;
	
	/**
	 * The distance, the entity has walked from the last tile he was.
	 */
	
	protected float distanceWalked;
	
	/**
	 * The current state of the entity.
	 */
	
	protected int state;
	
	public static final int STANDING = 0;
	public static final int WALKING = 1;
	public static final int WALKING_FINISHED = 2;
	
	public Entity(Room r, int x, int y, int z) {
		this.room = r;
		this.x = x;
		this.actualX = x;
		this.y = y;
		this.actualY = y;
		this.z = z;
		this.state = STANDING;
	}
	
	/**
	 * The entity gets updated
	 */
	
	public abstract void update();
	
	
	/**
	 * If the entity is walking, this method will update calculate the new position.
	 * If the entity reaches the next tile, the state will change to WALKING_FINISHED and the
	 * remaining walkable distance for this update will be left in distanceWalked.
	 */
	
	
	protected void keepWalking() {
		if (0 <= direction && direction <= 3) {
			this.actualX += Direction.DIR_X[direction]*walkingSpeed;
			this.actualY += Direction.DIR_Y[direction]*walkingSpeed;
			if (distanceWalked >= 1) {
				distanceWalked -= 1;
				state = WALKING_FINISHED;
			}
		} else {
			this.actualX += Direction.DIR_X[direction]*diagWalkingSpeed;
			this.actualY += Direction.DIR_Y[direction]*diagWalkingSpeed;
			if (distanceWalked >= 1.41421356f) {
				distanceWalked -= 1.41421356f;
				state = WALKING_FINISHED;
			}
		}
		if (state == WALKING_FINISHED) {
			this.hasLeft(room.getLayers().get(z).getTile(x, y));
			x += Direction.DIR_X[direction];
			y += Direction.DIR_X[direction];	
			this.walkedOn(room.getLayers().get(z).getTile(x, y));
		}
	}
	
	
	/**
	 * Sets the walking speed of the entity
	 */
	
	public void setWalkingSpeed(float speed) {
		this.walkingSpeed = speed;
		this.diagWalkingSpeed = speed / 1.41421356f;
	}
	
	
	/**
	 * ENTITY-TILE-INTERACTION
	 * The following methods are events that get fired when the actors walks
	 * from Tile to Tile. Tiles could have effects on the Actor, like changing
	 * the walking speed.
	 */	
	
	/**
	 * Entity walks on a tile
	 */
	
	protected void walkedOn(Tile t) {}
	
	/**
	 * Entity starts Heading to Tile t
	 */	
	
	protected void startsHeadingTo(Tile t) {}
	
	/**
	 * Entity leaves Tile
	 */	
	
	protected void leaves(Tile t) {}
	
	/**
	 * Entity has completely Left the Tile t
	 */	
	
	protected void hasLeft(Tile t) {}
	
	/**
	 * ENTITY-ENTITY-INTERACION
	 * The following methods are events the get fired when two entities meet, met or will meet.
	 * They could be thought of as the collision handling.
	 */

}
