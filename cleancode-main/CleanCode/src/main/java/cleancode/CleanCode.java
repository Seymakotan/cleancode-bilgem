package cleancode;

import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;

/*
@author Seyma Kotan
WarriorHuman sinifinin baseclassi olan Human sinifindaki Weapon nesnesini protected tanimladim, bu nesne WarriorHuman sinifindaki constructorı ile gonderildi.
Bu sayede WarriorHuman sinifindaki weapon'ın davranisini(nasil atanacagini,hangi weaponı kullanacagi) disaridan tanimladik

 */
public class CleanCode {

    public static void main(String[] args) {

        Weapon riffle = new Weapon("riffle", WeaponType.riffle);
        WarriorHuman warriorHuman = new WarriorHuman("Warrior", riffle);

        warriorHuman.useWeapon();
    }

}
