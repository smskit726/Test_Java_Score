package com.biz.score.service;

import com.biz.score.domain.ScoreVO;

public interface ScoreService {
	
	public void loadScore();
	public boolean inputScore();
	
	public void saveScoreVO(ScoreVO scoreVO);
	public void calcSum();
	public void calcAvg();
	
	public void scoreList();
	
	public void saveFile();
	
	

}
