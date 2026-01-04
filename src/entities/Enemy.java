package entities;

public class Enemy extends LivingEntity {
    private EnemyTier enemyTier;

    public Enemy(Builder builder) {
        super(builder);
        this.enemyTier = builder.enemyTier;
    }

    public static class Builder extends LivingEntity.Builder<Builder> {
        private EnemyTier enemyTier;

        @Override
        protected Builder self() {
            return this;
        }

        public Builder enemyTier(EnemyTier e) {
            this.enemyTier = e;
            return this;
        }

        public Enemy build() {
            return new Enemy(this);
        }

    }

    @Override
    public void update() {
        // TODO Implement per-frame logic
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
