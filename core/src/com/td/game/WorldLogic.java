package com.td.game;

import java.util.LinkedList;

import com.td.Entity.Entity;
import com.td.Entity.Mob;
import com.td.screens.GameScreen;
import com.td.util.Const;

public class WorldLogic {
private GameScreen game;
private int playerHp;
private int playerMoney;
private int[][] gameField;
private int lvl;
private LinkedList<Entity> weaponList;
private LinkedList<Entity> mobList;
private int spawn;

	public WorldLogic(GameScreen g) {
		game=g;
		playerHp=Const.START_HP;
		playerMoney=Const.START_CASH;
		weaponList=new LinkedList();
		mobList=new LinkedList();
		gameField = MapGenerator.drawField();
	}	
	
	public void update() {
		
		
		
		
		if(spawn==0) {
			mobList.add(new Mob());
			spawn=10;
		}else spawn--;
		
		
	}
	
	public LinkedList<Entity> getEntity(){
		LinkedList ent = new LinkedList(weaponList);
		ent.addAll(mobList);
		return ent;
	}
	
	public int[][] getGameField(){
		
		return gameField;
	}
}
