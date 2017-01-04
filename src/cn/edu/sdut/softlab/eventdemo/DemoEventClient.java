package cn.edu.sdut.softlab.eventdemo;
/**
 *测试事件监听器的整个处理过程
 *
 */
public class DemoEventClient {

       public static void main(String args[]) {

             // 定义事件源
            EventSource eventSource = new EventSource();

             // 定义并向事件源中注册事件监听器
           /* FirstEventListener firstEventListener = new FirstEventListener();
            eventSource.addDemoListener(firstEventListener);*/

             // 定义并向事件源中注册事件监听器
            SecondEventListener secondEventListener = new SecondEventListener();
           /* eventSource.addDemoListener(secondEventListener);*/

             // 事件通知
            eventSource.notifyDemoEvent(0,secondEventListener);
      }
}

