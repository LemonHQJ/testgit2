package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bean.Brand;
import com.bean.Color;
import com.bean.Product;
import com.bean.Size;

import sun.print.resources.serviceui;

public class ProductDao {

	public List<Product> getProduct(){
		List<Product> ps = new ArrayList<Product>();
		Product p1= new Product();
		Product p2= new Product();
		Product p3= new Product();
		Color c= new Color();
		List<String> cs = new ArrayList<String>();
		String c1 = "#FFFFFF";
		String c2 = "#FFFFF0";
		String c3 = "#FFFFE0";
		String c4 = "#FFFF00";
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		cs.add(c4);
		
		Size s = new Size();
		List<String> ss = new ArrayList<String>();
		String s1 = "x";
		String s2 = "s";
		String s3 = "m";
		String s4 = "d";
		String s5 = "xxl";
		ss.add(s5);
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		
		Brand b = new Brand();
		List<String> bs = new ArrayList<String>();
		String b1 = "a";
		String b2 = "b";
		String b3 = "c";
		String b4 = "d";
		String b5 = "e";
		
		bs.add(b1);
		bs.add(b2);
		bs.add(b3);
		bs.add(b4);
		bs.add(b5);
		
		
		
		ps.add(p3);
		ps.add(p1);
		ps.add(p2);
				
		
		return ps;
		
	}
	
}