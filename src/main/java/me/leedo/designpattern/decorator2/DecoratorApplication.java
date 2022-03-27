package me.leedo.designpattern.decorator2;

public class DecoratorApplication {
    public static void main(String[] args) {
        // 🦊 아리 + 💍 도란링 + 📚 메자이
        LolChampion ahri = new Ahri();
        ahri = new DoranRing(ahri);
        ahri = new Mejai(ahri);

        System.out.println("👊 아리 공격력 = " + ahri.getAttackDamage());
        System.out.println("🪄 아리 마법 공격력 = " + ahri.getAbilityPower());

        // 👩‍🎤 카이사 + 💍 도란링 + ⚔️ 마나무네
        LolChampion kaisa = new Kaisa();
        kaisa = new DoranRing(kaisa);
        kaisa = new Manamune(kaisa);

        System.out.println("👊 카이사 공격력 = " + kaisa.getAttackDamage());
        System.out.println("🪄 카이사 마법 공격력 = " + kaisa.getAbilityPower());
    }
}
