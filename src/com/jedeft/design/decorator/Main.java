package com.jedeft.design.decorator;

/**
 * 
 * @Desicription: 装饰模式是为已有功能动态地添加更多功能的一种方式
 * 应用场景：当系统需要新功能时，是向旧类中添加新的代码。这些新加的代码通常装饰了原有类的核心职责或主要行为
 * 但这种做法的主要问题在于，在主类中加入了新的字段，新的方法和新的逻辑，从而增加了主类的复杂度
 * 而新加入的东西只是为了满足在特定情况下才会执行的特殊需要。此时装饰模式提供了很好的解决方案。
 * 把每个要装饰的类放在单独的类中，并让这个类包装它所要装饰的对象，因此，当执行特殊行为时，客户代码就可以在运行时根据需要
 * 有选择地，按顺序地使用装饰功能包装对象了。
 * @author Jedeft
 * @date 2016年8月12日 下午5:04:54
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person("Jedeft");
		
		//对于Person来说是无须知道Finery存在的
//		Finery finery = new Finery();
		Shoes shoes = new Shoes();
		TShirt tshirt = new TShirt();
		Glasses glasses = new Glasses();
		
		//此处容易懵逼，再此处做以下具体分析
		//1. 通过Decorator方法，将shoes,tshirt这些对象向上转型为Person对象封装到Finery类中
		//2. 在执行glasses.show()时，服装类都通过向上转型封装入Finery类中了，第一个输出的眼镜是glasses.show()的结果
		//3. 在glasses.show()执行完后，其中的super.show()将调用父类的Finery的show方法。glasses的父类Finery中封装的person调用show方法时向下转型为tshirt对象
		//4. tshirt.show()执行完后，其中的super.show()将调用父类的Finery的show方法。glasses父类Finery中封装的person调用show方法时向下转型为shoes对象
		//5. shoes.show()执行完后，依次类推，到最后Finery中封装的是父类Person调用show方法
		shoes.Decorator(person);
		tshirt.Decorator(shoes);
		glasses.Decorator(tshirt);

		glasses.show();
		
		//输出结果：
		//眼镜
		//T恤
		//鞋子
		//的Jedeft
	}
}
