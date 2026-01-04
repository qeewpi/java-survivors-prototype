package entities;

import weapons.Weapon;

public class Player extends LivingEntity {
    private PlayerStats stats;
    private Weapon currentWeapon;

    public Player(Builder builder) {
        super(builder);
        this.stats = builder.stats;
        this.currentWeapon = builder.currentWeapon;
    }

    public static class Builder extends LivingEntity.Builder<Builder> {
        private PlayerStats stats;
        private Weapon currentWeapon;
    
        @Override
        protected Builder self() {
            return this;
        }

        public Builder stats(PlayerStats s) {
            this.stats = s;
            return this;
        }

        public Builder currentWeapon(Weapon w) {
            this.currentWeapon = w;
            return this;
        }

        public Player build() {
            return new Player(this);
        }

    }

    @Override
    public void update() {
        // TODO Implement per-frame logic
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
