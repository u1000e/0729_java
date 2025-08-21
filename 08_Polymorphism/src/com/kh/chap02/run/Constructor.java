package com.kh.chap02.run;

import com.kh.chap02.model.vo.BeerDrinker;
import com.kh.chap02.model.vo.Drinker;
import com.kh.chap02.model.vo.RiceWineDrinker;
import com.kh.chap02.model.vo.SojuDrinker;

public class Constructor {

	public static void main(String[] args) {
		
		SojuDrinker s1 = new SojuDrinker(1);
		SojuDrinker s2 = new SojuDrinker(3);
		BeerDrinker b1 = new BeerDrinker(false);
		BeerDrinker b2 = new BeerDrinker(true);
		RiceWineDrinker r1 = new RiceWineDrinker(40);
		RiceWineDrinker r2 = new RiceWineDrinker(50);
		
		s1.drink();
		s2.drink();
		b1.drink();
		b2.drink();
		r1.drink();
		r2.drink();
		
		s1.eat();
		s2.eat();
		b1.eat();
		b2.eat();
		r1.eat();
		r2.eat();
		
		System.out.println("===============================================");
		
		SojuDrinker[] sojuArr = new SojuDrinker[2];
		BeerDrinker[] beerArr = new BeerDrinker[2];
		RiceWineDrinker[] rwArr = new RiceWineDrinker[2];
		
		sojuArr[0] = s1;
		sojuArr[1] = s2;
		beerArr[0] = b1;
		beerArr[1] = b2;
		rwArr[0] = r1;
		rwArr[1] = r2;
		
		for(int i = 0; i < sojuArr.length; i++) {
			sojuArr[i].drink();
			sojuArr[i].eat();
		}
		for(int i = 0; i < beerArr.length; i++) {
			beerArr[i].drink();
			beerArr[i].eat();
		}
		for(int i = 0; i < rwArr.length; i++) {
			rwArr[i].drink();
			rwArr[i].eat();
		}
		
		System.out.println("===========================================");
		
		Drinker[] drinkArr = new Drinker[6];
		drinkArr[0] = s1;
		drinkArr[1] = s2;
		drinkArr[2] = b1;
		drinkArr[3] = b2;
		drinkArr[4] = r1;
		drinkArr[5] = r2;
		
		for(int i = 0; i < drinkArr.length; i++) {
			drinkArr[i].drink();
			drinkArr[i].eat();
		}

	}

}
