package com.maroo.android.maptest.constant;

import com.maroo.android.maptest.model.DummyPlace;
import com.maroo.android.maptest.model.PlaceModel;
import com.maroo.android.maptest.R;

import java.util.ArrayList;
import java.util.Arrays;

public interface AllConstant {

    int STORAGE_REQUEST_CODE = 1000;
    int LOCATION_REQUEST_CODE = 2000;

    ArrayList<PlaceModel> placesName = new ArrayList<>(
            Arrays.asList(
                    new PlaceModel(1, R.drawable.ic_restaurant, "Restaurant", "restaurant"),
                    new PlaceModel(2, R.drawable.ic_atm, "ATM", "atm"),
                    new PlaceModel(3, R.drawable.ic_gas_station, "Gas", "gas_station"),
                    new PlaceModel(4, R.drawable.ic_shopping_cart, "Groceries", "supermarket"),
                    new PlaceModel(5, R.drawable.ic_hotel, "Hotels", "hotel"),
                    new PlaceModel(6, R.drawable.ic_pharmacy, "Pharmacies", "pharmacy"),
                    new PlaceModel(7, R.drawable.ic_hospital, "Hospitals & Clinics", "hospital"),
                    new PlaceModel(8, R.drawable.ic_car_wash, "Car Wash", "car_wash"),
                    new PlaceModel(9, R.drawable.ic_saloon, "Beauty Salons", "beauty_salon")

            )
    );

    ArrayList<DummyPlace> dummyLocationName = new ArrayList<>(
            Arrays.asList(
                    new DummyPlace(1,"Germanos - Pastry",33.85217073479985, 35.89477838111461 ),
                    new DummyPlace(2,"Malak el Tawook" ,33.85334017189446, 35.89438946093824),
                    new DummyPlace(3, "Z Burger House",33.85454300475094, 35.894561122304474 ),
                    new DummyPlace(4,"Collège Oriental",33.85129821373707, 35.89446263654391),
                    new DummyPlace(5,"VERO MODA",33.85048738635312, 35.89664059012788)

            )
    );
    ArrayList<String> dummyLocationNames = new ArrayList<>(
            Arrays.asList(
                  "Germanos - Pastry","Malak el Tawook" , "Z Burger House","Collège Oriental","VERO MODA"
            )
    );
}
