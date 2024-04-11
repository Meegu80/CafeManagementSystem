
package com.javalab.sec03;

/**
 * 자동차 도메인 클래스
 * 자동차의 정보를 저장하는 역할의 클래스
 */
public class Car {
    // 필드(속성, 변수) 5개 선언

    String company = "현대자동차";
    String model;
    String color;
    int price;
    int speed;

    // 생성자
    // 생성자1, 필드를 기본값으로 초기화
    public Car() {

    }

    // 생성자2, model 필드만 초기화
    public Car(String model) {
        this.model = model;
    }
    // 생성자3, model과 color 필드만 초기화
    public Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    public Car(String model, String color,int price){
        this.model = model;
        this.color = color;
        this.price = price;

}
