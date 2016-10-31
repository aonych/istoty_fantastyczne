package db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Creature;

public class DataStorage {
	
	private List<Creature> creatures = new ArrayList<Creature>();
	
	public void add(Creature creature){
		try{
			creatures.add(creature);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Creature> getAllCreatures(){
		return creatures;
	}
	
	public void delete(String creatureName){
		Iterator<Creature> c = creatures.iterator();
		
		String name = creatureName.trim();
		
        try {
        	
        	while (c.hasNext()) {

        	    if (c.next().getName().equals(name)) {

        	        c.remove();
        	        break;
        	    }

        	}

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public Creature getByName(String name){
		
		Creature creature = null;
		
		try {
        	
			for(Creature character : creatures){

				if(character.getName().equals(name)){
					creature = character;
					
					break;
				}

			}

        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return creature;
		
	}
	
	public void update(String name){
		
	}
	

}
