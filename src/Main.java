public class Main {
    public static int findMax(int[] arr) {
        // Om den array som skickats till metoden är tom...
        if(arr.length == 0) {
            // ...då kastar vi en exception
            throw new IndexOutOfBoundsException();
        }
        // Vi låter det första värdet i arrayen initialt vara det största värdet
        int max = arr[0];
        // Loopa igenom alla, utom det första värdet
        for(int i = 1; i < arr.length; i++) {
            // Har vi hittat ett värde som är större än det som nu ligger i max?
            if(max < arr[i]) {
                // Om så, ändra max till det värde vi hittat
                max = arr[i];
            }
        }
        // Vi har hittat det största värdet, skicka tillbaka
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int result = findMax(arr);
        System.out.println(result);
    }
}
