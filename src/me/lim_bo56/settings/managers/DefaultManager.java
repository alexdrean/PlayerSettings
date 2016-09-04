package me.lim_bo56.settings.managers;

/**
 * Created by lim_bo56
 * On 8/14/2016
 * At 11:24 AM
 */
public class DefaultManager {

    private static ConfigurationManager configurationManager;

    public DefaultManager() {
        configurationManager = ConfigurationManager.getDefault();
        loadData();
    }

    public static boolean get(String path) {
        return configurationManager.getBoolean(path);
    }

    private void addDefault(String path, Object value) {
        configurationManager.addDefault(path, value);
    }

    private void loadData() {
        addDefault("Default.Visibility", true);
        addDefault("Default.Stacker", false);
        addDefault("Default.Chat", true);
        addDefault("Default.Vanish", false);
        addDefault("Default.Fly", false);
        addDefault("Default.Speed", false);
        addDefault("Default.Jump", false);
    }

}