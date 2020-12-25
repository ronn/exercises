package com.ronn.basis.interfaces;

import java.util.Arrays;
import java.util.List;

public class MomPopShop extends Bussiness implements TaxPayer{

    String industry;
    String ein;// id number

    public MomPopShop(String industry, String ein) {
        this.industry = industry;
        this.ein = ein;
    }

    public MomPopShop(String address, String industry, String ein) {
        this.address = address;
        this.industry = industry;
        this.ein = ein;
    }

    @Override
    public double payTaxes() {
        return 0.5;
    }

    @Override
    public String getTaxId() {
        return ein;
    }

  public static void main(String[] args) {
    List<Integer> ronn = ronn(728, Arrays.asList(680, 630, 620, 570, 530, 356, 355, 350, 348, 342, 80, 60, 56, 50, 47, 46, 43, 42));

    System.out.println(ronn);
  }

  public static List<Integer> ronn(int flightDuration, List<Integer> movieDuration) {
    int maxDuration = flightDuration - 30;
    int size = movieDuration.size();

    List<Integer> selected = Arrays.asList(-1, -1);

    for (int i = 0; i < size - 1; i ++){
      for (int j = 1; j < size; j ++){
        if ((movieDuration.get(i) + movieDuration.get(j)) == maxDuration){
          Integer longestMovie = movieDuration.get(i) > movieDuration.get(j)
              ? movieDuration.get(i)
              : movieDuration.get(j);

            System.out.println(i + ", " + j);
            System.out.println("Oe " + movieDuration.indexOf(longestMovie));
            System.out.println("Ah: " + selected + " contains " + movieDuration.indexOf(longestMovie) + ": " + selected.contains(movieDuration.indexOf(longestMovie)));
            if (!(selected.contains(i) && selected.contains(j))){
              if (
                  (longestMovie > selected.get(0) ||
                      longestMovie > selected.get(1))
                      && !selected.contains(movieDuration.indexOf(longestMovie))
              ){
                selected = Arrays.asList(i, j);
              }
            }


        }
      }
    }

    return selected;
  }
}
