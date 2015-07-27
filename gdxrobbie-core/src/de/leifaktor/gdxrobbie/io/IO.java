package de.leifaktor.gdxrobbie.io;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Base64Coder;
//import com.badlogic.gdx.utils.Json;
//import com.badlogic.gdx.utils.JsonReader;
//import com.badlogic.gdx.utils.JsonValue;
//import com.badlogic.gdx.utils.JsonWriter;
//import com.badlogic.gdx.utils.JsonWriter.OutputType;

import de.leifaktor.gdxrobbie.logic.Episode;
import de.leifaktor.gdxrobbie.logic.Floor;
import de.leifaktor.gdxrobbie.logic.Room;
import de.leifaktor.gdxrobbie.logic.tiles.Tile;

public class IO {
	
	private static boolean encoded = false;

	public static void saveToFile(Episode e, String filename){
		FileHandle file = Gdx.files.external(filename);
		String string = epToJSON(e);        
        if(encoded) file.writeString(Base64Coder.encodeString(string), false);
        else file.writeString(string, false);
    }
	
	public static Episode loadFromFile(String filename) {
		FileHandle file = Gdx.files.external(filename);
		String json = file.readString();
		return JSONToEp(json);		
	}
	
	private static String epToJSON(Episode e) {
//		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
//		try {
//			return mapper.writeValueAsString(e);
//		} catch (JsonGenerationException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (JsonMappingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		return null;
	}
	
	private static Episode JSONToEp(String s) {
//		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
//		Episode e = null;
//		try {
//			e = mapper.readValue(s, Episode.class);
//		} catch (JsonParseException e1) {
//			e1.printStackTrace();
//		} catch (JsonMappingException e1) {
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		return null;
	}
	
	
//	private static String episodeToJSON(Episode e) {
//		StringWriter writer = new StringWriter();
//		JsonWriter j = new JsonWriter(writer);
//		try {
//			j.setOutputType(OutputType.json);
//			j.object() // EPISODE
//			.name("name").value(e.getName())
//			.name("roomWidth").value(e.getRoomWidth())
//			.name("roomHeight").value(e.getRoomHeight())
//			.name("floors").array(); // FLOOR ARRAY			
//			for (Floor f: e.getFloors()) {
//				j.object() // EIN FLOOR
//				.name("width").value(f.getWidth())
//				.name("height").value(f.getHeight())
//				.name("rooms").array(); // ROOM ARRAY
//				for (int i = 0; i < f.getRooms().length; i++) {
//					j.object(); // EIN ROOM
//					if (f.getRooms()[i] != null) {
//						j.name("name").value(f.getRooms()[i].getName());
//						j.name("tiles").array(); // TILE ARRAY
//						for (int y=0; y < e.getRoomHeight(); y++) {
//							for (int x=0; x < e.getRoomWidth(); x++) {
//								j.value(f.getRooms()[i].getTile(x, y).getId());
//							}
//						}
//						j.pop(); // TILE ARRAY ENDE
//					}
//					j.pop(); // ROOM ENDE					
//				}
//				j.pop(); // ROOM ARRAY ENDE
//				j.pop(); // FLOOR ENDE
//			}
//			j.pop(); // EPISODE ENDE
//			j.close();
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//		Json json = new Json();
//		
//		return json.prettyPrint(writer.toString());
//		//return writer.toString();
//	}
//	
//	private static Episode JSONToEpisode(String json) {
//		JsonReader reader = new JsonReader();
//		JsonValue ob = reader.parse(json); // EPISODE
//		int roomWidth = ob.getInt("roomWidth");
//		int roomHeight = ob.getInt("roomHeight");
//		String name = ob.getString("name");
//		ob = ob.get("floors"); // FLOOR ARRAY
//		ArrayList<Floor> floors = new ArrayList<Floor>();
//		ob = ob.child; // ERSTER FLOOR
//		while (ob != null) {
//			int width = ob.getInt("width");
//			int height = ob.getInt("height");
//			Floor f = new Floor(width, height);			
//			JsonValue obroom = ob.get("rooms").child; // ERSTER ROOM
//			for (int i = 0; i < width*height; i++) {
//				if (obroom.get("tiles") != null) { // Falls ein Eintrag für die Tiles existiert, so ist dieser Raum vorhanden
//					Room r = new Room(roomWidth, roomHeight,f,i % roomWidth, i / roomWidth);
//					r.setName(obroom.getString("name"));
//					int[] tiles = obroom.get("tiles").asIntArray();
//					for (int j = 0; j < roomHeight; j++) {
//						for (int k = 0; k < roomWidth; k++) {
//							r.setTile(k, j, Tile.get(tiles[j*roomWidth+k]));
//						}
//					}
//					f.setRoom(i % width, i / width, r);
//				} else {
//					f.setRoom(i % width, i / width, null);
//				}
//				obroom = obroom.next; // NÄCHSTER ROOM
//			}
//			floors.add(f);
//			ob = ob.next(); // NÄCHSTER FLOOR
//		}
//		
//
//
//		Episode e = new Episode(roomWidth,roomHeight);
//		e.setName(name);
//		e.setFloors(floors);
//		return e;
//	}
	
}
