package task2;

import java.util.HashMap;


class Country {
    private HashMap<String, String> countryMap;

    public Country() {
        this.countryMap = new HashMap<>();
    }

    public HashMap<String, String> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(HashMap<String, String> countryMap) {
        this.countryMap = countryMap;
    }

    public void add(String countryName, String capitalName) {
        countryMap.put(countryName.toLowerCase(), capitalName);
    }

    public String search(String countryName) {
        if (countryMap.isEmpty()) {
            return "The map is empty";
        } else {
            String capital = countryMap.get(countryName.toLowerCase());
            return capital != null ? capital : "Data not found";
        }
    }
}

