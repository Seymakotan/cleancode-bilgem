package cleancode;

import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;


public abstract class Human {

    public String humanName;
    protected Weapon weapon;

    public Human(String humanName, Weapon weapon) {
        this.humanName = humanName;
        this.weapon = weapon;
    }

    public String getHumanName() {
        return humanName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public abstract void useWeapon();

    public abstract void craftWeapon(WeaponType type);
}
