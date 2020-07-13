package com.biz.score.exec;

import java.util.Scanner;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ScoreService sService = new ScoreServiceImplV1();
		sService.loadScore();
		
		while(true) {
			System.out.println("========================================================");
			System.out.println("성적처리 시스템V1");
			System.out.println("========================================================");
			System.out.println("1. 학생성적 등록");
			System.out.println("2. 성적일람표 출력");
			System.out.println("3. 성적파일 생성(.txt)");
			System.out.println("--------------------------------------------------------");
			System.out.println("QUIT. 업무종료");
			System.out.println("========================================================");
			System.out.print("업무 선택 >> ");
			
			String strMenu = scan.nextLine();
			
			if(strMenu.equals("QUIT")) {
				break;
			}
			
			int intMenu = 0;
			
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴는 숫자만 선택 가능합니다.");
				continue;
			}
			
			if(intMenu == 1) {
				while(sService.inputScore());
				
				sService.calcSum();
				sService.calcAvg();
				
			}else if(intMenu == 2) {
				
				sService.calcSum();
				sService.calcAvg();
				sService.scoreList();
			}else if(intMenu == 3) {
				sService.saveFile();
			}
		}
		System.out.println("업무 종료 :)");
		
	}
}
