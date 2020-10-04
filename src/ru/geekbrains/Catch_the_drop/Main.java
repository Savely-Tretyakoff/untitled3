package ru.geekbrains.Catch_the_drop;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int random = 0;
        int inputNum = 0;
        boolean bool = true;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random(10);


        random = rand.nextInt(10);

            while (true) {
                System.out.println("Введите число");
                inputNum = scan.nextInt();
                System.out.println();
                if (inputNum == random) {
                    System.out.println("Вы угадали");
                    bool = false;
                    break;
                }
                else if(inputNum > random) {
                    System.out.println("Число больше");
                }
                else {
                    System.out.println("Число меньше");
                }
                System.out.println("вторая попытка ");

                inputNum = scan.nextInt();
                System.out.println();
                if (inputNum == random) {
                    System.out.println("Вы угадали");
                    bool = false;
                    break;
                }
                else if(inputNum < random) {
                    System.out.println("Число больше");
                }
                else {
                    System.out.println("Число меньше");
                }
                System.out.println("третья попытка ");

                inputNum = scan.nextInt();
                System.out.println();
                if (inputNum == random) {
                    System.out.println("Вы угадали");
                    bool = false;
                    break;
                } else
                    {
                    System.out.println("Вы не угадали");
                    break;
                }



            }
            System.out.println("Если хотите повторить игру введите - 1");
        int l = 0;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        if (l==1);
        return ;
        }


        }


