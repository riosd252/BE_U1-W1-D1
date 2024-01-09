public class ArrayChaos {
    public String[] scatenaInferno (String[] a, String b) {
        String[] array = new String[6];

        for (int i = 0; i < a.length; i++) {
            if (i < 2 ) {
                array[i] = a[i];
            } else if (i == 2) {
                array[i] = b;
            } else {
                array[i] = a[i - 1];
            }
        }

        return array;
    }
}
