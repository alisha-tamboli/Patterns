package com.alishatamboli;

public class Firstclass {

    public static int factorial(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = i * facto;
        }
        return facto;
    }

    public static int BinoCoef(int n, int r) {
        int n_facto = factorial(n);
        int r_facto = factorial(r);
        int nmr = factorial(n - r);
        int BC = n_facto / (r_facto * nmr);
        return BC;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Primesinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void BintoDec(int binNum) {
        int my_num = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal form of " + my_num + " is " + decNum);
    }

    public static void DectoBin(int n) {
        int my_number = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int remainder = n % 2;
            binNum = binNum + (remainder * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary form of " + my_number + " is " + binNum);
    }

    public static int Averageof3(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("Average of 3 numbers is " + average);
        return average;
    }

    public static boolean EVEN(int n) {
        boolean Even = false;
        if (n % 2 == 0) {
            Even = true;
            System.out.print(" Given number " + n + " is Even number ");
        } else {
            Even = false;
            System.out.print(" Given number " + n + " is Odd number ");
        }
        return Even;
    }
    

    public static int binary_search(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { //right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        //swap
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void pairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) { // 2 ,4 ,6, 8, 10
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("numbers of pairs is = " + tp);
    }

    public static void subarray(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        //prefix
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];


                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum of subarray  = " + maxsum);
    }

    public static void kadanesAlgorithm(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max of array : " + ms);
    }


        public static void main(String args[]){

            }
        }


