import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {

        Set<String> result = new HashSet<>(Set.of());

        result.addAll(cards);

        return result;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {

       if (myCollection.isEmpty() || theirCollection.isEmpty()){
           return false;
       }

       if (myCollection.containsAll(theirCollection)) {
           return false;
        }

       boolean myCollectionUnique = myCollection.stream()
               .anyMatch(card -> !theirCollection.contains(card));

       boolean theirCollectionUnique = theirCollection.stream()
               .anyMatch(card -> !myCollection.contains(card));

       return myCollectionUnique && theirCollectionUnique;
    }

    static Set<String> commonCards(List<Set<String>> collections) {


        Set<String> commonCards = new HashSet<>(collections.getFirst());

        if (collections.isEmpty()){
            return new HashSet<>();
        }

        for (Set<String> set : collections){
            commonCards.retainAll(set);
        }


        return commonCards;

    }

    static Set<String> allCards(List<Set<String>> collections) {

        Set<String> allCards = new HashSet<>();

        collections.forEach(allCards::addAll);

        return allCards;

    }
}
