package org.teamx.xworldcore.api;

import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.WorldType;

/**
 *
 * World-Properties
 * @author Shustin
 *
 */

public abstract interface IXWorld {

    /**
     *
     * @return world
     */
    public abstract World getXWorld();

    /**
     *
     * @return WorldName
     */
    public abstract String getWorldName();

    /**
     *
     * @return difficulty
     */
    public abstract Difficulty getDifficulty();

    /**
     *
     * @param difficulty
     * @return
     */
    public abstract void setDifficulty(Difficulty difficulty);

    /**
     *
     * @return seed
     */
    public abstract long getSeed();

    /**
     *
     * @param seed
     * @return
     */
    public abstract void setSeed(long seed);

    /**
     *
     * @return worldType
     */
    public abstract WorldType getWorldType();

    /**
     *
     * @param worldType
     * @return
     */
    public abstract void setWorldType(WorldType worldType);

    /**
     *
     * @return gameMode
     */
    public abstract GameMode getGameMode();

    /**
     *
     * @param gameMode
     * @return
     */
    public abstract void setGameMode(GameMode gameMode);

    /**
     *
     *@return
     */
    public abstract World.Environment getEnviroment();

    /**
     *
     * @param enviroment
     * @return
     */
    public abstract void setEnviroment(World.Environment enviroment);

}
