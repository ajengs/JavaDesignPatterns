package proxy.pattern.demo;

import proxy.pattern.proxyClasses.Proxy;

public class ProxyPatternEx {
	public static void main(String args[]) {
		System.out.println("Proxy pattern demo\n");
		Proxy px = new Proxy();
		px.doSomeWork();
	}
}
