package cn.edu.sdut.softlab.eventdemo;

import java.util.EventListener;

/**
 * DemoEvent事件监听器的接口
 *
 */
public interface IDemoEventListener extends EventListener {
	public void process(DemoEvent event);
}
