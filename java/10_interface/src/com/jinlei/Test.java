package com.jinlei;

import com.jinlei.Mtd.Sd;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		Camera  cam1 = new Camera();
	//	cam1.start();
		Computer computer = new Computer();
		//computer.usbUsb(phone);
		Usb usb = new Camera();

		Sd sd = new Sd(){    //Sd�ǽӿ�
			
			public void sd_start(Computer cmp, int speed)
			{
				System.out.println("sd���Ĺ����ٶ���"+speed);
				System.out.println("speed = "+cmp.sp);
			}
		};	
		computer.usbSd(sd);
		
	
		Usb usb2 = new Usb() {

			public void stop() {
				// TODO Auto-generated method stub
				
			}
			
			public void start(int speed) {
				// TODO Auto-generated method stub
				System.out.println("USB�Ĺ����ٶ���"+speed);
				
			}
		};
		usb2.start(3000);
		computer.usbUsb(usb2);
		
	}

}
//�ӿ�����ķ�������ʵ�֣��ӿ��Ǹ��ӳ���ĳ����࣬һ�������ʵ�ֶ���ӿ�,�ӿ��еı������뱻��ʼ��
interface Usb
{
	int a = 1;   //��̬�ģ�������final
	public void start(int speed);
	public void stop();
}
interface Keyboard
{
	public void write();
}
class Camera implements Usb,Keyboard
{
	public void start(int speed)
	{
		
		System.out.println("�����������Ҫ��ʼ������!");
		System.out.println("USB�Ĺ����ٶ���"+speed);
	}
	public void stop()
	{
		
		System.out.println("�����������Ҫֹͣ������!");
	}
	public void write()
	{
		
	}
}
class Phone implements Usb
{
	public void start(int speed)
	{
		
		System.out.println("�����ֻ�����Ҫ��ʼ������!");
		System.out.println("USB�Ĺ����ٶ���"+speed);
	}
	public void stop()
	{
		
		System.out.println("�����ֻ�����Ҫֹͣ������!");
	}
}
class Computer
{
	int sp = 1000;
	public void usbUsb(Usb usb)
	{
		usb.start(sp);
		usb.stop();
	
		System.out.println("a = " + Usb.a);
	
	}
	public void usbSd(Mtd.Sd sd)
	{
		sd.sd_start(this,sp);
		
	}
}
class Mtd
{
	public  interface Sd{
		public void sd_start(Computer cmp,int speed);
	}
}