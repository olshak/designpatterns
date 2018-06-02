package pl.sda.designpatterns.builder;

public class BuilderExample {
    public static void main(String[] args) {
        NutritionFacts noBuilderCocaCola = new NutritionFacts();
        noBuilderCocaCola.setServingSize(240);
        noBuilderCocaCola.setServings(8);
        noBuilderCocaCola.setCalories(100);
        noBuilderCocaCola.setSodium(35);
        noBuilderCocaCola.setCarbohydrate(27);
        System.out.println(noBuilderCocaCola);

        BuilderNutritionFacts builderCocaCola = new BuilderNutritionFacts.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(builderCocaCola);
    }
}
