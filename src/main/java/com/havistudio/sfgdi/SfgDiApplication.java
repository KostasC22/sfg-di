package com.havistudio.sfgdi;

import com.havistudio.sfgdi.controllers.ConstructorInjectedController;
import com.havistudio.sfgdi.controllers.GetterInjectedController;
import com.havistudio.sfgdi.controllers.MyController;
import com.havistudio.sfgdi.controllers.PropertyInjectedController;
import com.havistudio.sfgdi.examplebeans.FakeDataSource;
import com.havistudio.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUser());

	}

}
