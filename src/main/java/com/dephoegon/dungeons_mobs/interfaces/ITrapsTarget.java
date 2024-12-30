package com.dephoegon.dungeons_mobs.interfaces;

public interface ITrapsTarget {

    void setTargetTrapped(boolean trapped, boolean notifyOthers);

    boolean isTargetTrapped();
}
