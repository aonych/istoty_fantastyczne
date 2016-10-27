package db;

import java.util.ArrayList;
import java.util.List;

import model.Creature;

public class DataStorage {
	
	private List<Creature> db = new ArrayList<Creature>();
	
	public void add(Creature creature){
		Creature newIstota = new Creature(creature.getName(), creature.getPower(), creature.getType());
		db.add(newIstota);
	}
	
	public List<Creature> getAllCreatures(){
		return db;
	}

}
