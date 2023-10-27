package no.runsafe.framework.api;

import java.util.regex.Pattern;

public final class ConsoleColour {
    private ConsoleColour() {
    }

    public static String FromMinecraft(String input) {
        String message = input;
        message = BUKKIT_DARK_GREEN.matcher(message).replaceAll(DARK_GREEN);
        message = BUKKIT_DARK_BLUE.matcher(message).replaceAll(DARK_BLUE);
        message = BUKKIT_BLACK.matcher(message).replaceAll(BLACK);
        message = BUKKIT_DARK_AQUA.matcher(message).replaceAll(DARK_AQUA);
        message = BUKKIT_DARK_RED.matcher(message).replaceAll(DARK_RED);
        message = BUKKIT_DARK_PURPLE.matcher(message).replaceAll(DARK_PURPLE);
        message = BUKKIT_GOLD.matcher(message).replaceAll(GOLD);
        message = BUKKIT_GRAY.matcher(message).replaceAll(GRAY);
        message = BUKKIT_DARK_GRAY.matcher(message).replaceAll(DARK_GRAY);
        message = BUKKIT_BLUE.matcher(message).replaceAll(BLUE);
        message = BUKKIT_GREEN.matcher(message).replaceAll(GREEN);
        message = BUKKIT_AQUA.matcher(message).replaceAll(AQUA);
        message = BUKKIT_RED.matcher(message).replaceAll(RED);
        message = BUKKIT_LIGHT_PURPLE.matcher(message).replaceAll(LIGHT_PURPLE);
        message = BUKKIT_YELLOW.matcher(message).replaceAll(YELLOW);
        message = BUKKIT_WHITE.matcher(message).replaceAll(WHITE);
        message = BUKKIT_MAGIC.matcher(message).replaceAll(MAGIC);
        message = BUKKIT_BOLD.matcher(message).replaceAll(BOLD);
        message = BUKKIT_STRIKETHROUGH.matcher(message).replaceAll(STRIKETHROUGH);
        message = BUKKIT_UNDERLINE.matcher(message).replaceAll(UNDERLINE);
        message = BUKKIT_ITALIC.matcher(message).replaceAll(ITALIC);
        message = BUKKIT_RESET.matcher(message).replaceAll(RESET);
        return message + RESET;
    }

    //  this.toString = new String("§', code});

    private static final Pattern BUKKIT_DARK_GREEN = Pattern.compile("§2");
    private static final Pattern BUKKIT_DARK_BLUE = Pattern.compile("§1");
    private static final Pattern BUKKIT_BLACK = Pattern.compile("§0");
    private static final Pattern BUKKIT_DARK_AQUA = Pattern.compile("§3");
    private static final Pattern BUKKIT_DARK_RED = Pattern.compile("§4");
    private static final Pattern BUKKIT_DARK_PURPLE = Pattern.compile("§5");
    private static final Pattern BUKKIT_GOLD = Pattern.compile("§6");
    private static final Pattern BUKKIT_GRAY = Pattern.compile("§7");
    private static final Pattern BUKKIT_DARK_GRAY = Pattern.compile("§8");
    private static final Pattern BUKKIT_BLUE = Pattern.compile("§9");
    private static final Pattern BUKKIT_GREEN = Pattern.compile("§a");
    private static final Pattern BUKKIT_AQUA = Pattern.compile("§b");
    private static final Pattern BUKKIT_RED = Pattern.compile("§c");
    private static final Pattern BUKKIT_LIGHT_PURPLE = Pattern.compile("§d");
    private static final Pattern BUKKIT_YELLOW = Pattern.compile("§e");
    private static final Pattern BUKKIT_WHITE = Pattern.compile("§f");
    private static final Pattern BUKKIT_MAGIC = Pattern.compile("§k");
    private static final Pattern BUKKIT_BOLD = Pattern.compile("§l");
    private static final Pattern BUKKIT_STRIKETHROUGH = Pattern.compile("§m");
    private static final Pattern BUKKIT_UNDERLINE = Pattern.compile("§n");
    private static final Pattern BUKKIT_ITALIC = Pattern.compile("§o");
    private static final Pattern BUKKIT_RESET = Pattern.compile("§r");
    public static final String DARK_GREEN = ANSIRendition.Clear().faint().foreground(ANSIColour.Green).toString();
    public static final String DARK_BLUE = ANSIRendition.Clear().faint().foreground(ANSIColour.Blue).toString();
    public static final String BLACK = ANSIRendition.Clear().foreground(ANSIColour.Black).toString();
    public static final String DARK_AQUA = ANSIRendition.Clear().faint().foreground(ANSIColour.Cyan).toString();
    public static final String DARK_RED = ANSIRendition.Clear().faint().foreground(ANSIColour.Red).toString();
    public static final String DARK_PURPLE = ANSIRendition.Clear().faint().foreground(ANSIColour.Magenta).toString();
    public static final String GOLD = ANSIRendition.Clear().faint().foreground(ANSIColour.Yellow).toString();
    public static final String GRAY = ANSIRendition.Clear().foreground(ANSIColour.White).toString();
    public static final String DARK_GRAY = ANSIRendition.Clear().faint().foreground(ANSIColour.White).faint().toString();
    public static final String BLUE = ANSIRendition.Clear().foreground(ANSIColour.Blue).bright().toString();
    public static final String GREEN = ANSIRendition.Clear().foreground(ANSIColour.Green).bright().toString();
    public static final String AQUA = ANSIRendition.Clear().foreground(ANSIColour.Cyan).bright().toString();
    public static final String RED = ANSIRendition.Clear().foreground(ANSIColour.Red).bright().toString();
    public static final String LIGHT_PURPLE = ANSIRendition.Clear().foreground(ANSIColour.Magenta).bright().toString();
    public static final String YELLOW = ANSIRendition.Clear().foreground(ANSIColour.Yellow).bright().toString();
    public static final String WHITE = ANSIRendition.Clear().bright().foreground(ANSIColour.White).toString();
    public static final String MAGIC = ANSIRendition.Clear().foreground(ANSIColour.Black).background(ANSIColour.White).bright().reverse().toString();
    public static final String BOLD = ANSIRendition.Clear().bright().toString();
    public static final String STRIKETHROUGH = ANSIRendition.Clear().crossedOut().toString();
    public static final String UNDERLINE = ANSIRendition.Clear().underline().toString();
    public static final String ITALIC = ANSIRendition.Clear().italic().toString();
    public static final String RESET = ANSIRendition.Clear().toString();
}

