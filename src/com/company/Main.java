package com.company;


import java.io.*;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static char result[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку для дишифровки");
        String res2 = sc.nextLine();
        result = res2.toCharArray();
        descript();
    }

    public static void descript() {
        int i = 0;
        int resultFinal = result.length - 1;
        while (i < result.length) {
            if (result[i] == 'а' || result[i] == 'А'){
                result[i] = 'б';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'б'|| result[i] == 'Б'){
                result[i] = 'в';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'в' || result[i] == 'В'){
                result[i] = 'г';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'г'|| result[i] == 'Г'){
                result[i] = 'д';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'д'|| result[i] == 'Д' ){
                result[i] = 'е';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'е' || result[i] == 'Е'){
                result[i] = 'ё';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ё' || result[i] == 'Ё'){
                result[i] = 'ж';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ж' || result[i] == 'Ж'){
                result[i] = 'з';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'з' || result[i] == 'З'){
                result[i] = 'и';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'и' || result[i] == 'И'){
                result[i] = 'й';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'й' || result[i] == 'Й'){
                result[i] = 'к';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'к' || result[i] == 'К'){
                result[i] = 'л';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'л' || result[i] == 'Л'){
                result[i] = 'м';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'м' || result[i] == 'М'){
                result[i] = 'н';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'н' || result[i] == 'Н'){
                result[i] = 'о';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'о' || result[i] == 'О'){
                result[i] = 'п';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'п' || result[i] == 'П'){
                result[i] = 'р';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'р' || result[i] == 'Р'){
                result[i] = 'с';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'с' || result[i] == 'С'){
                result[i] = 'т';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'т' || result[i] == 'Т'){
                result[i] = 'у';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'у' || result[i] == 'У'){
                result[i] = 'ф';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ф' || result[i] == 'Ф'){
                result[i] = 'х';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'х' || result[i] == 'Х'){
                result[i] = 'ц';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ц' || result[i] == 'Ц'){
                result[i] = 'ч';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ч' || result[i] == 'Ч'){
                result[i] = 'ш';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ш' || result[i] == 'Ш'){
                result[i] = 'щ';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'щ' || result[i] == 'Щ'){
                result[i] = 'ъ';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ъ' || result[i] == 'Ъ'){
                result[i] = 'ы';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ы' || result[i] == 'Ы'){
                result[i] = 'ь';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ь' || result[i] == 'Ь'){
                result[i] = 'э';
                if (i == result.length){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'э' || result[i] == 'Э'){
                result[i] = 'ю';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'ю' || result[i] == 'Ю'){
                result[i] = 'я';

                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == 'я' || result[i] == 'Я'){
                result[i] = 'а';
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
            if (result[i] == ' ' || result[i] == '.' || result[i] == ','){
                if (i == resultFinal){
                    break;
                }
                else {
                    i++;
                }
            }
        }
        System.out.println(result);
        Scanner ans = new Scanner(System.in);
        System.out.println("Корректно расшифровалось? 1-да, 2-нет");
        int f = ans.nextInt();
        if (f == 2){
            System.out.println("Продолжаем...");
            descript();
        }
        if (f == 1){
            System.out.println("Отлично");
            System.exit(0);
        }
    }
}
