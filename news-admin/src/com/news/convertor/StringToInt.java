package com.news.convertor;

public class StringToInt {
	public int getStringToInt(String String){
		switch (String) {
		case "ʱ��":
			return 1;
		case "����":
			return 2;
		case "����":
			return 3;
		case "����":
			return 4;
		case "����":
			return 5;
		case "����":
			return 6;
		case "����":
			return 7;
		case "ʱ��":
			return 8;
		case "�Ƽ�":
			return 9;
		case "����":
			return 10;
		default:
			break;
		}
		return 0;
	}
}
