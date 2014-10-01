package com.talentica.job4j.api;

public interface XOutputConsumer<O> extends OutputConsumer<O>, Runnable{
	public boolean isFinished();
	public void setFinished(boolean isFinished);
	public void setJob(Job job);
}
