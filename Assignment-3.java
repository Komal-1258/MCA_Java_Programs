/*Wap in java that averages the synsets created for 3 months April, May and June. Declare and initialize variable to the synset entered for each month.
Compute the average and write out the results,something like this:
Synsets Entered for April: 12
Synsets Entered for May: 14
Synsets Entered for June: 8
Average Synset Entered : 11.333333 */



public class SynsetAverage {
    public static void main(String[] args) {
        int aprilSynsets = 12;
        int maySynsets = 14;
        int juneSynsets = 8;

        double averageSynsets = (aprilSynsets + maySynsets + juneSynsets) / 3.0;

        System.out.println("Synsets Entered for April: " + aprilSynsets);
        System.out.println("Synsets Entered for May: " + maySynsets);
        System.out.println("Synsets Entered for June: " + juneSynsets);
        System.out.println("Average Synset Entered: " + averageSynsets);
    }
}
