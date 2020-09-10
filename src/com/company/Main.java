package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

	    Rectangle r1 = new Rectangle(3,4);
	    Rectangle r2 = new Rectangle(7,8);
	    Rectangle r3 = new Rectangle(10,20);
	    Square q1 = new Square(4);
	    IGeometry ir2 = new Rectangle(5,6);
	    IGeometry iq2 = new Square(4);


        List<Rectangle> list = new ArrayList<>();
        List<IGeometry> figures = new ArrayList<>();

        figures.add(r1);
        figures.add(r2);
        figures.add(r3);
        figures.add(q1);
        figures.add(ir2);
        figures.add(iq2);

        list.add(r1);
        list.add(r2);
        list.add(r3);

        System.out.println(list.size());

        double totalArea = 0;

        for (Rectangle item: list){
            System.out.println(item.toString() + " - " + item.getArea());
            totalArea += item.getArea();
        }
        System.out.println(totalArea);

        double totalAllArea = 0;
        for (IGeometry item: figures){
            System.out.println(item.toString() + " - " + item.getArea());
            totalAllArea += item.getArea();
        }
        System.out.println(totalAllArea);

        List<Square> list2 = new ArrayList<>(
                Arrays.asList(
                        q1,
                        new Square(5), new Square(6), new Square(7)
                )
        );
        System.out.println(list2.get(1));
        list.stream().filter(item -> item.getArea()>15).forEach(System.out::println);

        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Java");
        words.add("Red");
        words.add("Monkey");
        words.add("Step");
        words.add("Acadeny");

        List<String> shortList = words.stream().filter(item -> item.length()>4).collect(Collectors.toList());
        //"(item -> item.length()>4)" - називається лямда-виражение
        System.out.println(shortList);

    }
}
