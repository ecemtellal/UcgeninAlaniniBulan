import java.util.Scanner;
public class AreaofTriangle {
    public static void main(String[] args) {
        int firstside,secondside,thirdside;
        double area;

        Scanner input=new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz: ");
        firstside=input.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        secondside=input.nextInt();
        System.out.println("Üçüncü kenarı giriniz: ");
        thirdside=input.nextInt();

        int 𝑢 = (firstside+secondside+thirdside) / 2;
        area = Math.sqrt(𝑢 * (𝑢 - firstside)* (𝑢 - secondside) * (𝑢 - thirdside));

        System.out.print("Üçgenin alanı: " + area);

    }
}
