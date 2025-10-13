package net.alminoris.aestheticseating.util.helper;

import net.alminoris.aestheticseating.AestheticSeating;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModJsonHelper
{
    public static void createShapedRecipe(String outputName, String count, String ingredient1Name, String ingredient2Name, String pattern1, String pattern2, String pattern3)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/data/"+ AestheticSeating.MOD_ID+"/recipe/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = outputName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SHAPED_RECIPE.replace("COUNT", count)
                .replace("INGREDIENT1_NAME", ingredient1Name).replace("INGREDIENT2_NAME", ingredient2Name).replace("OUTPUT_NAME", outputName)
                .replace("PATTERN1", pattern1).replace("PATTERN2", pattern2).replace("PATTERN3", pattern3);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleChairModel(String jsonContent, String colorName, String woodName, String modId, boolean isReclined, boolean isCarpeted)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/" + colorName;

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_chair_" + woodName + (isReclined ? "_reclined" : "") + (isCarpeted ? "_carpeted" : "") + ".json";
        File modelFile = new File(directory, fileName);

        String logName = (woodName.equals("crimson") || woodName.equals("warped")) ? "stem" : (woodName.equals("bamboo") ? "block" : "log");

        jsonContent = jsonContent.replace("COLOR_NAME", colorName).replace("BASE_NAME", modId+":block/stripped_"+woodName+"_"+logName)
                .replace("LOG_NAME", modId+":block/"+woodName+"_"+logName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleBenchModel(String jsonContent, String woodName, String modId, String variant, boolean backrest)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_bench_" + woodName + ((variant.equals("normal")) ? "" : "_" + variant) + (backrest ? "_backrest" : "") +  ".json";
        File modelFile = new File(directory, fileName);

        String logName = (woodName.equals("crimson") || woodName.equals("warped")) ? "stem" : (woodName.equals("bamboo") ? "block" : "log");

        jsonContent = jsonContent.replace("BASE_NAME", modId+":block/stripped_"+woodName+"_"+logName)
                .replace("LOG_NAME", modId+":block/"+woodName+"_"+logName);;

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createStoneBenchModel(String jsonContent, String stoneName, String modId, String variant)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "stone_bench_" + stoneName + ((variant.equals("normal")) ? "" : "_" + variant) +  ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("BASE_NAME", modId+":block/"+stoneName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSeatingLogModel(String jsonContent, String woodName, String modId, String variant)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "seating_log_" + woodName + ((variant.equals("normal")) ? "" : "_" + variant) +  ".json";
        File modelFile = new File(directory, fileName);

        String logName = (woodName.equals("crimson") || woodName.equals("warped")) ? "stem" : (woodName.equals("bamboo") ? "block" : "log");

        jsonContent = jsonContent.replace("BASE_NAME", modId+":block/"+woodName+"_"+logName).replace("LOG_NAME", modId+":block/"+woodName+"_"+logName+"_top");

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleChairBlockState(String woodName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_chair_" + woodName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SIMPLE_CHAIR_BLOCKSTATE_TEMPLATE.replace("WOOD_NAME_VALUE", woodName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleBenchBlockState(String woodName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_bench_" + woodName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SIMPLE_BENCH_BLOCKSTATE_TEMPLATE.replace("WOOD_NAME_VALUE", woodName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createStoneBenchBlockState(String stoneName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "stone_bench_" + stoneName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.STONE_BENCH_BLOCKSTATE_TEMPLATE.replace("STONE_NAME_VALUE", stoneName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSeatingLogBlockState(String stoneName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "seating_log_" + stoneName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SEATING_LOG_BLOCKSTATE_TEMPLATE.replace("WOOD_NAME_VALUE", stoneName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSetteeModel(String jsonContent, String colorName, String modId, boolean isTransformed, int variant)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "settee_" + colorName + (isTransformed ? "_transformed" : "") + "_" + variant + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("COLOR_NAME", modId + ":block/" + colorName+"_wool");

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSofaModel(String jsonContent, String colorName, String modId, String variant, Boolean isCushion)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "sofa_" + colorName + ((variant.equals("normal")) ? "" : "_" + variant) + (isCushion ? "_cushion" : "") + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("COLOR_NAME", modId + ":block/" + colorName+"_wool");

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSetteeBlockState(String colorName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "settee_" + colorName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SETTEE_BLOCKSTATE_TEMPLATE.replace("COLOR_NAME_VALUE", colorName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSofaBlockState(String colorName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "sofa_" + colorName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SOFA_BLOCKSTATE_TEMPLATE.replace("COLOR_NAME_VALUE", colorName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleBlockState(String name)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SIMPLE_BLOCKSTATE_TEMPLATE.replace("NAME", name);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createCushionModel(String colorName, String modId)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "cushion_" + colorName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.CUSHION_MODEL_TEMPLATE.replace("COLOR_NAME", modId + ":block/" + colorName+"_wool");

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleStoolModel(String jsonContent, String colorName, String woodName, String modId, String form, boolean isCarpeted)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/" + colorName;

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_stool_" + form + "_" + woodName + (isCarpeted ? "_carpeted" : "") + ".json";
        File modelFile = new File(directory, fileName);

        String logName = (woodName.equals("crimson") || woodName.equals("warped")) ? "stem" : (woodName.equals("bamboo") ? "block" : "log");

        jsonContent = jsonContent.replace("COLOR_NAME", colorName).replace("BASE_NAME", modId+":block/stripped_"+woodName+"_"+logName)
                .replace("LOG_NAME", modId+":block/"+woodName+"_"+logName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleStoolBlockState(String woodName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_stool_" + woodName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SIMPLE_STOOL_BLOCKSTATE_TEMPLATE.replace("WOOD_NAME_VALUE", woodName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}