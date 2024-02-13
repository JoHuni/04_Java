package edu.kh.collection.pack2.run;

import edu.kh.collection.pack2.model.service.SetService;

public class SetRun {
	public static void main(String[] src) {
		SetService service = new SetService();
//		service.method1();
//		service.method2();
//		service.method3();
//		service.method4();
		service.lottoNumberGenerator();
	}
}
