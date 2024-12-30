package com.dephoegon.dungeons_mobs.entities;

public interface AnimatableMeleeAttackMob {

    int getAttackAnimationTick();

    void setAttackAnimationTick(int attackAnimationTick);

    int getAttackAnimationLength();

    int getAttackAnimationActionPoint();
}
