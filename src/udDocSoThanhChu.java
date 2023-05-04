import java.util.Scanner;

public class udDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc : ");
        int number = scanner.nextInt();
        int nghin = number / 1000;
        int tram = (number % 1000) / 100;
        int chuc = (number % 100) / 10;
        int donVi = number % 10;
        String doc = "";
        switch (nghin) {
            case 1:
                doc += "one thousand ";
                break;
            case 2:
                doc += "two thousand ";
                break;
            case 3:
                doc += "three thousand ";
                break;
            case 4:
                doc += "four thousand ";
                break;
            case 5:
                doc += "five thousand ";
                break;
            case 6:
                doc += "six thousand ";
                break;
            case 7:
                doc += "seven thousand ";
                break;
            case 8:
                doc += "eight thousand ";
                break;
            case 9:
                doc += "nine thousand ";
                break;
            default:
                break;
        }
        switch (tram) {
            case 1:
                doc += "one hundred ";
                break;
            case 2:
                doc += "two hundred ";
                break;
            case 3:
                doc += "three hundred ";
                break;
            case 4:
                doc += "four hundred ";
                break;
            case 5:
                doc += "five hundred ";
                break;
            case 6:
                doc += "six hundred ";
                break;
            case 7:
                doc += "seven hundred ";
                break;
            case 8:
                doc += "eight hundred ";
                break;
            case 9:
                doc += "nine hundred ";
                break;
            default:
                break;
        }
        if (chuc == 1) {
            switch (donVi) {
                case 0:
                    doc += "ten";
                    break;
                case 1:
                    doc += "eleven";
                    break;
                case 2:
                    doc += "twelve";
                    break;
                case 3:
                    doc += "thirteen";
                    break;
                case 4:
                    doc += "fourteen";
                    break;
                case 5:
                    doc += "fifteen";
                    break;
                case 6:
                    doc += "sixteen";
                    break;
                case 7:
                    doc += "seventeen";
                    break;
                case 8:
                    doc += "eighteen";
                    break;
                case 9:
                    doc += "nineteen";
                    break;
                default:
                    break;
            }
        } else {
            switch (chuc) {
                case 2:
                    doc += "twenty ";
                    break;
                case 3:
                    doc += "thirty ";
                    break;
                case 4:
                    doc += "forty ";
                    break;
                case 5:
                    doc += "fifty ";
                    break;
                case 6:
                    doc += "sixty ";
                    break;
                case 7:
                    doc += "seventy ";
                    break;
                case 8:
                    doc += "eighty ";
                    break;
                case 9:
                    doc += "ninety ";
                    break;
                default:
                    break;
            }
            switch (donVi) {
                case 1:
                    doc += "one";
                    break;
                case 2:
                    doc += "two";
                    break;
                case 3:
                    doc += "three";
                    break;
                case 4:
                    doc += "four";
                    break;
                case 5:
                    doc += "five";
                    break;
                case 6:
                    doc += "six";
                    break;
                case 7:
                    doc += "seven";
                    break;
                case 8:
                    doc += "eight";
                    break;
                case 9:
                    doc += "nine";
                    break;
                default:
                    break;

            }
        }
        System.out.println(doc);
        scanner.close();
    }
}
