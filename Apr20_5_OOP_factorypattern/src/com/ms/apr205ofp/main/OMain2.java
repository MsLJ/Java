package com.ms.apr205ofp.main;

import com.ms.apr205ofp.game.Monster;
import com.ms.apr205ofp.game.Summoner;

//게임
//  오크
//		x
//		y
//		공격하기-주먹질
//  트롤
//		x
//		y
//		공격하기-칼질
//  해골
//		x
//		y
//		공격하기-화살


public class OMain2 {
	public static void main(String[] args) throws InterruptedException {
		Summoner s=new Summoner();
		Monster m;
		for (int i = 0; i < 10; i++) {
			m=s.summon();
			m.attack();
			Thread.sleep(1000);
			
		}

	}

}
