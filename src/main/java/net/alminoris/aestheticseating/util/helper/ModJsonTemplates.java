package net.alminoris.aestheticseating.util.helper;

public class ModJsonTemplates
{
    public static final String SIMPLE_CHAIR_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"1": "BASE_NAME",
            		"2": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"east": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"south": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"west": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"up": {"uv": [12, 12, 3, 3], "texture": "#1"},
            				"down": {"uv": [12, 3, 3, 12], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 7, 3],
            			"to": [12.75, 17, 4],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 12, 3.5]},
            			"faces": {
            				"north": {"uv": [3.25, 3, 12.75, 13], "texture": "#1"},
            				"east": {"uv": [12, 3, 13, 13], "texture": "#1"},
            				"south": {"uv": [3.25, 3, 12.75, 13], "texture": "#1"},
            				"west": {"uv": [3, 3, 4, 13], "texture": "#1"},
            				"up": {"uv": [12.75, 4, 3.25, 3], "texture": "#1"},
            				"down": {"uv": [12.75, 3, 3.25, 4], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"up": {"uv": [1, 6, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"up": {"uv": [1, 6, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [6, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [6, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [6, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [6, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": []
            		}
            	]
            }
            """;

    public static final String SIMPLE_CHAIR_CARPETED_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "minecraft:block/COLOR_NAME_wool",
            		"1": "BASE_NAME",
            		"2": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"east": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"south": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"west": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"up": {"uv": [12, 12, 3, 3], "texture": "#1"},
            				"down": {"uv": [12, 3, 3, 12], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 7, 3],
            			"to": [12.75, 17, 4],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 12, 3.5]},
            			"faces": {
            				"north": {"uv": [3.25, 3, 12.75, 13], "texture": "#1"},
            				"east": {"uv": [12, 3, 13, 13], "texture": "#1"},
            				"south": {"uv": [3.25, 3, 12.75, 13], "texture": "#1"},
            				"west": {"uv": [3, 3, 4, 13], "texture": "#1"},
            				"up": {"uv": [12.75, 4, 3.25, 3], "texture": "#1"},
            				"down": {"uv": [12.75, 3, 3.25, 4], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"up": {"uv": [1, 6, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"up": {"uv": [1, 6, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [6, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [6, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [6, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [6, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"from": [3.5, 8, 4.25],
            			"to": [12.5, 8.5, 12.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8, 4.75]},
            			"faces": {
            				"north": {"uv": [4, 4, 13, 5], "texture": "#0"},
            				"east": {"uv": [4, 4, 13, 5], "texture": "#0"},
            				"south": {"uv": [4, 4, 13, 5], "texture": "#0"},
            				"west": {"uv": [4, 4, 13, 5], "texture": "#0"},
            				"up": {"uv": [13, 13, 4, 4], "texture": "#0"},
            				"down": {"uv": [13, 4, 4, 13], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [10]
            		}
            	]
            }
            """;

    public static final String SIMPLE_CHAIR_RECLINED_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"1": "BASE_NAME",
            		"2": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"east": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"south": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"west": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"up": {"uv": [12, 12, 3, 3], "texture": "#1"},
            				"down": {"uv": [12, 3, 3, 12], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 7, 2],
            			"to": [12.75, 17, 3],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 12, 2.5]},
            			"faces": {
            				"north": {"uv": [3.25, 3, 12.75, 13], "texture": "#1"},
            				"east": {"uv": [12, 3, 13, 13], "texture": "#1"},
            				"south": {"uv": [3.25, 3, 12.75, 13], "texture": "#1"},
            				"west": {"uv": [3, 3, 4, 13], "texture": "#1"},
            				"up": {"uv": [12.75, 4, 3.25, 3], "texture": "#1"},
            				"down": {"uv": [12.75, 3, 3.25, 4], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"up": {"uv": [1, 6, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"up": {"uv": [1, 6, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [6, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [6, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [6, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [6, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": []
            		}
            	]
            }
            """;

    public static final String SIMPLE_CHAIR_RECLINED_CARPETED_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "minecraft:block/COLOR_NAME_wool",
            		"1": "BASE_NAME",
            		"2": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"east": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"south": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"west": {"uv": [3, 3, 12, 4], "texture": "#1"},
            				"up": {"uv": [12, 12, 3, 3], "texture": "#1"},
            				"down": {"uv": [12, 3, 3, 12], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 7, 2],
            			"to": [12.75, 17, 3],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 12, 2.5]},
            			"faces": {
            				"north": {"uv": [3.25, 3, 12.75, 13], "texture": "#1"},
            				"east": {"uv": [12, 3, 13, 13], "texture": "#1"},
            				"south": {"uv": [3.25, 3, 12.75, 13], "texture": "#1"},
            				"west": {"uv": [3, 3, 4, 13], "texture": "#1"},
            				"up": {"uv": [12.75, 4, 3.25, 3], "texture": "#1"},
            				"down": {"uv": [12.75, 3, 3.25, 4], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"up": {"uv": [1, 6, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"up": {"uv": [1, 6, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [6, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [6, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [6, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [6, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"from": [3.5, 8, 4.25],
            			"to": [12.5, 8.5, 12.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8, 4.75]},
            			"faces": {
            				"north": {"uv": [4, 4, 13, 5], "texture": "#0"},
            				"east": {"uv": [4, 4, 13, 5], "texture": "#0"},
            				"south": {"uv": [4, 4, 13, 5], "texture": "#0"},
            				"west": {"uv": [4, 4, 13, 5], "texture": "#0"},
            				"up": {"uv": [13, 13, 4, 4], "texture": "#0"},
            				"down": {"uv": [13, 4, 4, 13], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [10]
            		}
            	]
            }
            """;

    public static final String SIMPLE_CHAIR_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,reclined=false,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 }
              }
            }
            """;

    public static final String SIMPLE_BENCH_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,variant=normal,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE" },
                "facing=south,variant=normal,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,variant=normal,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,variant=normal,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE", "y": 90 },
            
                "facing=north,variant=center,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center" },
                "facing=south,variant=center,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center", "y": 180 },
                "facing=west,variant=center,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center", "y": 270 },
                "facing=east,variant=center,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center", "y": 90 },
            
                "facing=north,variant=left,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left" },
                "facing=south,variant=left,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left", "y": 180 },
                "facing=west,variant=left,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left", "y": 270 },
                "facing=east,variant=left,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left", "y": 90 },
            
                "facing=north,variant=right,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right" },
                "facing=south,variant=right,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right", "y": 180 },
                "facing=west,variant=right,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right", "y": 270 },
                "facing=east,variant=right,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right", "y": 90 },
            
                "facing=north,variant=normal,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_backrest" },
                "facing=south,variant=normal,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_backrest", "y": 180 },
                "facing=west,variant=normal,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_backrest", "y": 270 },
                "facing=east,variant=normal,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_backrest", "y": 90 },
            
                "facing=north,variant=center,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center_backrest" },
                "facing=south,variant=center,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center_backrest", "y": 180 },
                "facing=west,variant=center,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center_backrest", "y": 270 },
                "facing=east,variant=center,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center_backrest", "y": 90 },
            
                "facing=north,variant=left,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left_backrest" },
                "facing=south,variant=left,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left_backrest", "y": 180 },
                "facing=west,variant=left,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left_backrest", "y": 270 },
                "facing=east,variant=left,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left_backrest", "y": 90 },
            
                "facing=north,variant=right,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right_backrest" },
                "facing=south,variant=right,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right_backrest", "y": 180 },
                "facing=west,variant=right,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right_backrest", "y": 270 },
                "facing=east,variant=right,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right_backrest", "y": 90 }
              }
            }
            """;

    public static final String STONE_BENCH_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,variant=normal": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE" },
                "facing=south,variant=normal": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE", "y": 180 },
                "facing=west,variant=normal": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE", "y": 270 },
                "facing=east,variant=normal": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE", "y": 90 },
            
                "facing=north,variant=center": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_center" },
                "facing=south,variant=center": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_center", "y": 180 },
                "facing=west,variant=center": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_center", "y": 270 },
                "facing=east,variant=center": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_center", "y": 90 },
            
                "facing=north,variant=left": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_left" },
                "facing=south,variant=left": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_left", "y": 180 },
                "facing=west,variant=left": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_left", "y": 270 },
                "facing=east,variant=left": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_left", "y": 90 },
            
                "facing=north,variant=right": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_right" },
                "facing=south,variant=right": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_right", "y": 180 },
                "facing=west,variant=right": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_right", "y": 270 },
                "facing=east,variant=right": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_right", "y": 90 }
              }
            }
            """;

    public static final String SEATING_LOG_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,variant=normal": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE" },
                "facing=south,variant=normal": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,variant=normal": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,variant=normal": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE", "y": 90 },
            
                "facing=north,variant=center": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_center" },
                "facing=south,variant=center": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_center", "y": 180 },
                "facing=west,variant=center": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_center", "y": 270 },
                "facing=east,variant=center": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_center", "y": 90 },
            
                "facing=north,variant=left": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_left" },
                "facing=south,variant=left": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_left", "y": 180 },
                "facing=west,variant=left": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_left", "y": 270 },
                "facing=east,variant=left": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_left", "y": 90 },
            
                "facing=north,variant=right": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_right" },
                "facing=south,variant=right": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_right", "y": 180 },
                "facing=west,variant=right": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_right", "y": 270 },
                "facing=east,variant=right": { "model": "aestheticseating:block/seating_log_WOOD_NAME_VALUE_right", "y": 90 }
              }
            }
            """;

    public static final String SOFA_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,variant=normal,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE" },
                "facing=south,variant=normal,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE", "y": 180 },
                "facing=west,variant=normal,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE", "y": 270 },
                "facing=east,variant=normal,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE", "y": 90 },
            
                "facing=north,variant=center,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center" },
                "facing=south,variant=center,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center", "y": 180 },
                "facing=west,variant=center,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center", "y": 270 },
                "facing=east,variant=center,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center", "y": 90 },
            
                "facing=north,variant=left,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left" },
                "facing=south,variant=left,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left", "y": 180 },
                "facing=west,variant=left,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left", "y": 270 },
                "facing=east,variant=left,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left", "y": 90 },
            
                "facing=north,variant=right,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right" },
                "facing=south,variant=right,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right", "y": 180 },
                "facing=west,variant=right,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right", "y": 270 },
                "facing=east,variant=right,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right", "y": 90 },
            
                "facing=north,variant=leftcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner" },
                "facing=south,variant=leftcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner", "y": 180 },
                "facing=west,variant=leftcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner", "y": 270 },
                "facing=east,variant=leftcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner", "y": 90 },
            
                "facing=north,variant=rightcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner" },
                "facing=south,variant=rightcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner", "y": 180 },
                "facing=west,variant=rightcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner", "y": 270 },
                "facing=east,variant=rightcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner", "y": 90 },
            
                "facing=north,variant=normal,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_cushion" },
                "facing=south,variant=normal,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_cushion", "y": 180 },
                "facing=west,variant=normal,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_cushion", "y": 270 },
                "facing=east,variant=normal,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_cushion", "y": 90 },
            
                "facing=north,variant=center,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center_cushion" },
                "facing=south,variant=center,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center_cushion", "y": 180 },
                "facing=west,variant=center,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center_cushion", "y": 270 },
                "facing=east,variant=center,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center_cushion", "y": 90 },
            
                "facing=north,variant=left,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left_cushion" },
                "facing=south,variant=left,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left_cushion", "y": 180 },
                "facing=west,variant=left,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left_cushion", "y": 270 },
                "facing=east,variant=left,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left_cushion", "y": 90 },
            
                "facing=north,variant=right,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right_cushion" },
                "facing=south,variant=right,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right_cushion", "y": 180 },
                "facing=west,variant=right,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right_cushion", "y": 270 },
                "facing=east,variant=right,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right_cushion", "y": 90 },
            
                "facing=north,variant=leftcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner_cushion" },
                "facing=south,variant=leftcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner_cushion", "y": 180 },
                "facing=west,variant=leftcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner_cushion", "y": 270 },
                "facing=east,variant=leftcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner_cushion", "y": 90 },
            
                "facing=north,variant=rightcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner_cushion" },
                "facing=south,variant=rightcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner_cushion", "y": 180 },
                "facing=west,variant=rightcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner_cushion", "y": 270 },
                "facing=east,variant=rightcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner_cushion", "y": 90 }
              }
            }
            """;

    public static final String SETTEE_0_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [8, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"up": {"uv": [12, 12, 0, 0], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [20, 2, 7]},
            			"faces": {
            				"north": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"east": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"south": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"west": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"up": {"uv": [16, 12, 4, 0], "texture": "#0"},
            				"down": {"uv": [16, 0, 4, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2.48254, -0.34462],
            			"to": [16, 10.48254, 4.65538],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 6.48254, 2.15538]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [0, 8, 5, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"west": {"uv": [0, 8, 5, 16], "texture": "#0"},
            				"up": {"uv": [16, 5, 0, 0], "texture": "#0"},
            				"down": {"uv": [16, 0, 0, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 4.5, 0],
            			"to": [0, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [4, 14, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 4.5, 0],
            			"to": [20, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [4, 14, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6]
            		}
            	]
            }
            """;

    public static final String SETTEE_TRANSFORMED_0_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
            		{
            			"from": [8, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 14], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 0],
            			"to": [8, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-4, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 14], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 1.98254, 0.15538],
            			"to": [4, 6.98254, 16.15538],
            			"rotation": {"angle": -45, "axis": "z", "origin": [0, 4.48254, 8.15538]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 8], "rotation": 270, "texture": "#0"},
            				"east": {"uv": [16, 5, 0, 0], "rotation": 180, "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 8], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 5], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 14],
            			"to": [8, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [4, 12, 0, 0], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 12], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 14],
            			"to": [20, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [4, 12, 0, 0], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 12], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6]
            		}
            	]
            }
            """;

    public static final String SETTEE_1_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [8, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"up": {"uv": [12, 12, 0, 0], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [20, 2, 7]},
            			"faces": {
            				"north": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"east": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"south": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"west": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"up": {"uv": [16, 12, 4, 0], "texture": "#0"},
            				"down": {"uv": [16, 0, 4, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2.48254, -0.34462],
            			"to": [16, 10.48254, 4.65538],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 6.48254, 2.15538]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [0, 8, 5, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"west": {"uv": [0, 8, 5, 16], "texture": "#0"},
            				"up": {"uv": [16, 5, 0, 0], "texture": "#0"},
            				"down": {"uv": [16, 0, 0, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 4.11313, 4.58239],
            			"to": [7, 10.11313, 6.58239],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [4, 7.11313, 5.58239]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 6, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 6], "texture": "#0"},
            				"up": {"uv": [6, 2, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 4.5, 0],
            			"to": [0, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [4, 14, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 4.5, 0],
            			"to": [20, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [4, 14, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static final String SETTEE_TRANSFORMED_1_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
            		{
            			"from": [8, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 14], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 0],
            			"to": [8, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-4, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 14], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 1.98254, 0.15538],
            			"to": [4, 6.98254, 16.15538],
            			"rotation": {"angle": -45, "axis": "z", "origin": [0, 4.48254, 8.15538]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 8], "rotation": 270, "texture": "#0"},
            				"east": {"uv": [16, 5, 0, 0], "rotation": 180, "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 8], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 5], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.8, 4.01313, 1.58239],
            			"to": [19.8, 6.01313, 7.58239],
            			"rotation": {"angle": 0, "axis": "z", "origin": [16.8, 5.01313, 4.58239]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 6], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [6, 0, 0, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 6], "rotation": 270, "texture": "#0"},
            				"west": {"uv": [6, 2, 0, 0], "rotation": 180, "texture": "#0"},
            				"up": {"uv": [0, 0, 6, 6], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 6, 6], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 14],
            			"to": [8, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [4, 12, 0, 0], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 12], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 14],
            			"to": [20, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [4, 12, 0, 0], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 12], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static final String SETTEE_2_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [8, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"up": {"uv": [12, 12, 0, 0], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [20, 2, 7]},
            			"faces": {
            				"north": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"east": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"south": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"west": {"uv": [4, 0, 16, 4], "texture": "#0"},
            				"up": {"uv": [16, 12, 4, 0], "texture": "#0"},
            				"down": {"uv": [16, 0, 4, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2.48254, -0.34462],
            			"to": [16, 10.48254, 4.65538],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 6.48254, 2.15538]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [0, 8, 5, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"west": {"uv": [0, 8, 5, 16], "texture": "#0"},
            				"up": {"uv": [16, 5, 0, 0], "texture": "#0"},
            				"down": {"uv": [16, 0, 0, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 4.11313, 4.58239],
            			"to": [7, 10.11313, 6.58239],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [4, 7.11313, 5.58239]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 6, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 6], "texture": "#0"},
            				"up": {"uv": [6, 2, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [9, 4.11313, 4.58239],
            			"to": [15, 10.11313, 6.58239],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [12, 7.11313, 5.58239]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 6, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 6], "texture": "#0"},
            				"up": {"uv": [6, 2, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 4.5, 0],
            			"to": [0, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [4, 14, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 4.5, 0],
            			"to": [20, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [4, 14, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		}
            	]
            }
            """;

    public static final String SETTEE_TRANSFORMED_2_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
            		{
            			"from": [8, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 14], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 0],
            			"to": [8, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-4, 2, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 4], "texture": "#0"},
            				"up": {"uv": [12, 0, 0, 14], "texture": "#0"},
            				"down": {"uv": [12, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 1.98254, 0.15538],
            			"to": [4, 6.98254, 16.15538],
            			"rotation": {"angle": -45, "axis": "z", "origin": [0, 4.48254, 8.15538]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 8], "rotation": 270, "texture": "#0"},
            				"east": {"uv": [16, 5, 0, 0], "rotation": 180, "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 8], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 5], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.8, 4.01313, 7.58239],
            			"to": [19.8, 6.01313, 13.58239],
            			"rotation": {"angle": 0, "axis": "z", "origin": [16.8, 5.01313, 10.58239]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 6], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [6, 0, 0, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 6], "rotation": 270, "texture": "#0"},
            				"west": {"uv": [6, 2, 0, 0], "rotation": 180, "texture": "#0"},
            				"up": {"uv": [0, 0, 6, 6], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 6, 6], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.8, 4.01313, 1.58239],
            			"to": [19.8, 6.01313, 7.58239],
            			"rotation": {"angle": 0, "axis": "z", "origin": [16.8, 5.01313, 4.58239]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 6], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [6, 0, 0, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 6], "rotation": 270, "texture": "#0"},
            				"west": {"uv": [6, 2, 0, 0], "rotation": 180, "texture": "#0"},
            				"up": {"uv": [0, 0, 6, 6], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 6, 6], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 0.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 0.5], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 14],
            			"to": [8, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [4, 12, 0, 0], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 12], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 14],
            			"to": [20, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [4, 12, 0, 0], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 12], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		}
            	]
            }
            """;

    public static final String SETTEE_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,transformed=false,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_0" },
                "facing=south,transformed=false,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_0", "y": 180 },
                "facing=west,transformed=false,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_0", "y": 270 },
                "facing=east,transformed=false,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_0", "y": 90 },
                "facing=north,transformed=true,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_0" },
                "facing=south,transformed=true,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_0", "y": 180 },
                "facing=west,transformed=true,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_0", "y": 270 },
                "facing=east,transformed=true,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_0", "y": 90 },
                "facing=north,transformed=false,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_1" },
                "facing=south,transformed=false,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_1", "y": 180 },
                "facing=west,transformed=false,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_1", "y": 270 },
                "facing=east,transformed=false,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_1", "y": 90 },
                "facing=north,transformed=true,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_1" },
                "facing=south,transformed=true,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_1", "y": 180 },
                "facing=west,transformed=true,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_1", "y": 270 },
                "facing=east,transformed=true,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_1", "y": 90 },
                "facing=north,transformed=false,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_2" },
                "facing=south,transformed=false,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_2", "y": 180 },
                "facing=west,transformed=false,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_2", "y": 270 },
                "facing=east,transformed=false,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_2", "y": 90 },
                "facing=north,transformed=true,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_2" },
                "facing=south,transformed=true,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_2", "y": 180 },
                "facing=west,transformed=true,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_2", "y": 270 },
                "facing=east,transformed=true,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_2", "y": 90 }
              }
            }
            """;

    public static final String SIMPLE_BLOCKSTATE_TEMPLATE = """
            {
               "variants": {
                 "": {
                   "model": "aestheticseating:block/NAME"
                 }
               }
             }
            """;

    public static final String CUSHION_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
            		{
            			"from": [3, 0, 3],
            			"to": [13, 4, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 10, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 4], "texture": "#0"},
            				"up": {"uv": [10, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [10, 0, 0, 10], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [-56.75, 0, 0],
            			"translation": [0, 4.25, -2.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [-56.75, 0, 0],
            			"translation": [0, 4.25, -2.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [56.75, 0, 0],
            			"translation": [0, 7, 7],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [56.75, 0, 0],
            			"translation": [0, 7, 7],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 4, 0]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 6, 0]
            		},
            		"fixed": {
            			"rotation": [90, 0, 0],
            			"translation": [0, 0, 6]
            		}
            	}
            }
            """;

    public static final String SIMPLE_STOOL_NORMAL_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"1": "BASE_NAME",
            		"2": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg2",
            			"from": [4, 0, 10.5],
            			"to": [5.5, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.75, 0, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [10.5, 0, 10.5],
            			"to": [12, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.25, 0, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [10.5, 0, 4],
            			"to": [12, 7, 5.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.25, 0, 3.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [4, 0, 4],
            			"to": [5.5, 7, 5.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.75, 0, 3.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.45, 7, 3.5],
            			"to": [12.55, 8, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 7, 2.5]},
            			"faces": {
            				"north": {"uv": [4, 4, 13, 5], "texture": "#1"},
            				"east": {"uv": [4, 4, 13, 5], "texture": "#1"},
            				"south": {"uv": [4, 4, 13, 5], "texture": "#1"},
            				"west": {"uv": [4, 4, 13, 5], "texture": "#1"},
            				"up": {"uv": [13, 13, 4, 4], "texture": "#1"},
            				"down": {"uv": [13, 4, 4, 13], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [4.35, 5.25, 5.5],
            			"to": [5.15, 7, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"up": {"uv": [1, 5, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [10.85, 5.25, 5.5],
            			"to": [11.65, 7, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"up": {"uv": [1, 5, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5.5, 5.25, 10.85],
            			"to": [10.5, 7, 11.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 14.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [5, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [5, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5.5, 5.25, 4.35],
            			"to": [10.5, 7, 5.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 8.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [5, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [5, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": []
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_LATTICEBACK_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"1": "BASE_NAME",
            		"2": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 0.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 10, 0.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg6",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4.25],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [3, 3, 13, 4], "texture": "#1"},
            				"east": {"uv": [3, 3, 13, 4], "texture": "#1"},
            				"south": {"uv": [3, 3, 13, 4], "texture": "#1"},
            				"west": {"uv": [3, 3, 13, 4], "texture": "#1"},
            				"up": {"uv": [13, 13, 3, 3], "texture": "#1"},
            				"down": {"uv": [13, 3, 3, 13], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 16, 3.25],
            			"to": [12.75, 17, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [10, 1, 0, 0], "texture": "#1"},
            				"down": {"uv": [10, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.5, 7, 3.25],
            			"to": [4.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 9], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 9], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 9], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 9], "texture": "#2"},
            				"up": {"uv": [1, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [5.5, 7, 3.25],
            			"to": [6.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 9], "texture": "#2"},
            				"east": {"uv": [1, 0, 2, 9], "texture": "#2"},
            				"south": {"uv": [1, 0, 2, 9], "texture": "#2"},
            				"west": {"uv": [1, 0, 2, 9], "texture": "#2"},
            				"up": {"uv": [2, 1, 1, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 1, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [7.5, 7, 3.25],
            			"to": [8.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [2, 0, 3, 9], "texture": "#2"},
            				"east": {"uv": [2, 0, 3, 9], "texture": "#2"},
            				"south": {"uv": [2, 0, 3, 9], "texture": "#2"},
            				"west": {"uv": [2, 0, 3, 9], "texture": "#2"},
            				"up": {"uv": [3, 1, 2, 0], "texture": "#2"},
            				"down": {"uv": [3, 0, 2, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [9.5, 7, 3.25],
            			"to": [10.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [3, 0, 4, 9], "texture": "#2"},
            				"east": {"uv": [3, 0, 4, 9], "texture": "#2"},
            				"south": {"uv": [3, 0, 4, 9], "texture": "#2"},
            				"west": {"uv": [3, 0, 4, 9], "texture": "#2"},
            				"up": {"uv": [4, 1, 3, 0], "texture": "#2"},
            				"down": {"uv": [4, 0, 3, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [11.5, 7, 3.25],
            			"to": [12.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [16, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [4, 0, 5, 9], "texture": "#2"},
            				"east": {"uv": [4, 0, 5, 9], "texture": "#2"},
            				"south": {"uv": [4, 0, 5, 9], "texture": "#2"},
            				"west": {"uv": [4, 0, 5, 9], "texture": "#2"},
            				"up": {"uv": [5, 1, 4, 0], "texture": "#2"},
            				"down": {"uv": [5, 0, 4, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"up": {"uv": [1, 8, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 8], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"up": {"uv": [1, 8, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 8], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [8, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [8, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 0.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [8, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [8, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": []
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_DESK_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"1": "LOG_NAME",
            		"2": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg4",
            			"from": [10.5, 0, 4.5],
            			"to": [12, 7, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 3.5, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [10.5, 0, 10.5],
            			"to": [12, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 3.5, 11.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"name": "leg6",
            			"from": [4, 0, 10.5],
            			"to": [5.5, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 3.5, 11.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"name": "leg7",
            			"from": [4, 0, 4.5],
            			"to": [5.5, 7, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 3.5, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.7, 7, 4.25],
            			"to": [12.3, 8, 12.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 8.25]},
            			"faces": {
            				"north": {"uv": [4, 4, 12, 5], "texture": "#2"},
            				"east": {"uv": [4, 4, 12, 5], "texture": "#2"},
            				"south": {"uv": [4, 4, 12, 5], "texture": "#2"},
            				"west": {"uv": [4, 4, 12, 5], "texture": "#2"},
            				"up": {"uv": [12, 12, 4, 4], "texture": "#2"},
            				"down": {"uv": [12, 4, 4, 12], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.7, 12.25, 4.25],
            			"to": [12.3, 16.5, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.375, 4.625]},
            			"faces": {
            				"north": {"uv": [4, 4, 12, 8], "texture": "#2"},
            				"east": {"uv": [4, 4, 4.75, 8], "texture": "#2"},
            				"south": {"uv": [4, 4, 12, 8], "texture": "#2"},
            				"west": {"uv": [4, 4, 4.75, 8], "texture": "#2"},
            				"up": {"uv": [12, 4.75, 4, 4], "texture": "#2"},
            				"down": {"uv": [12, 4, 4, 4.75], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.75, 16, 3.5],
            			"to": [12.25, 17, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 16.5, 3.875]},
            			"faces": {
            				"north": {"uv": [0, 0, 9, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.75, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 9, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.75, 1], "texture": "#1"},
            				"up": {"uv": [9, 0.75, 0, 0], "texture": "#1"},
            				"down": {"uv": [9, 0, 0, 0.75], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [10.5, 7, 3.75],
            			"to": [11.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11, 11.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 9], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 9], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 9], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 9], "texture": "#1"},
            				"up": {"uv": [1, 0.5, 0, 0], "texture": "#1"},
            				"down": {"uv": [1, 0, 0, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [4.5, 7, 3.75],
            			"to": [5.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [5, 11.5, 4]},
            			"faces": {
            				"north": {"uv": [2, 0, 3, 9], "texture": "#1"},
            				"east": {"uv": [2, 0, 2.5, 9], "texture": "#1"},
            				"south": {"uv": [2, 0, 3, 9], "texture": "#1"},
            				"west": {"uv": [2, 0, 2.5, 9], "texture": "#1"},
            				"up": {"uv": [3, 0.5, 2, 0], "texture": "#1"},
            				"down": {"uv": [3, 0, 2, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [4.35, 5.25, 5.25],
            			"to": [5.15, 7, 10.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 6.125, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"up": {"uv": [1, 5, 0, 0], "texture": "#1"},
            				"down": {"uv": [1, 0, 0, 5], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [10.85, 5.25, 5.25],
            			"to": [11.65, 7, 10.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 6.125, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"up": {"uv": [1, 5, 0, 0], "texture": "#1"},
            				"down": {"uv": [1, 0, 0, 5], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5.25, 5.25, 10.85],
            			"to": [10.75, 7, 11.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6.125, 11.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"up": {"uv": [5, 1, 0, 0], "texture": "#1"},
            				"down": {"uv": [5, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5.25, 5.25, 4.85],
            			"to": [10.75, 7, 5.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6.125, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"up": {"uv": [5, 1, 0, 0], "texture": "#1"},
            				"down": {"uv": [5, 0, 0, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": []
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_NORMAL_CARPETED_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "minecraft:block/COLOR_NAME_wool",
            		"1": "BASE_NAME",
            		"2": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg2",
            			"from": [4, 0, 10.5],
            			"to": [5.5, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.75, 0, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [10.5, 0, 10.5],
            			"to": [12, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.25, 0, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [10.5, 0, 4],
            			"to": [12, 7, 5.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.25, 0, 3.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [4, 0, 4],
            			"to": [5.5, 7, 5.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.75, 0, 3.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.45, 7, 3.5],
            			"to": [12.55, 8, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 7, 2.5]},
            			"faces": {
            				"north": {"uv": [4, 4, 13, 5], "texture": "#1"},
            				"east": {"uv": [4, 4, 13, 5], "texture": "#1"},
            				"south": {"uv": [4, 4, 13, 5], "texture": "#1"},
            				"west": {"uv": [4, 4, 13, 5], "texture": "#1"},
            				"up": {"uv": [13, 13, 4, 4], "texture": "#1"},
            				"down": {"uv": [13, 4, 4, 13], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [4.35, 5.25, 5.5],
            			"to": [5.15, 7, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"up": {"uv": [1, 5, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [10.85, 5.25, 5.5],
            			"to": [11.65, 7, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 5, 9]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"up": {"uv": [1, 5, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5.5, 5.25, 10.85],
            			"to": [10.5, 7, 11.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 14.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [5, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [5, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5.5, 5.25, 4.35],
            			"to": [10.5, 7, 5.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 8.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [5, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [5, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"from": [3.75, 8, 3.75],
            			"to": [12.25, 8.5, 12.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8, 4]},
            			"faces": {
            				"north": {"uv": [4, 4, 12, 4.5], "texture": "#0"},
            				"east": {"uv": [4, 4, 12, 4.5], "texture": "#0"},
            				"south": {"uv": [4, 4, 12, 4.5], "texture": "#0"},
            				"west": {"uv": [4, 4, 12, 4.5], "texture": "#0"},
            				"up": {"uv": [12, 12, 4, 4], "texture": "#0"},
            				"down": {"uv": [12, 4, 4, 12], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [9]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_LATTICEBACK_CARPETED_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "minecraft:block/COLOR_NAME_wool",
            		"1": "BASE_NAME",
            		"2": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 0.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 10, 0.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg6",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#2"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4.25],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [3, 3, 13, 4], "texture": "#1"},
            				"east": {"uv": [3, 3, 13, 4], "texture": "#1"},
            				"south": {"uv": [3, 3, 13, 4], "texture": "#1"},
            				"west": {"uv": [3, 3, 13, 4], "texture": "#1"},
            				"up": {"uv": [13, 13, 3, 3], "texture": "#1"},
            				"down": {"uv": [13, 3, 3, 13], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 16, 3.25],
            			"to": [12.75, 17, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [10, 1, 0, 0], "texture": "#1"},
            				"down": {"uv": [10, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.5, 7, 3.25],
            			"to": [4.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 9], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 9], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 9], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 9], "texture": "#2"},
            				"up": {"uv": [1, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [5.5, 7, 3.25],
            			"to": [6.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 9], "texture": "#2"},
            				"east": {"uv": [1, 0, 2, 9], "texture": "#2"},
            				"south": {"uv": [1, 0, 2, 9], "texture": "#2"},
            				"west": {"uv": [1, 0, 2, 9], "texture": "#2"},
            				"up": {"uv": [2, 1, 1, 0], "texture": "#2"},
            				"down": {"uv": [2, 0, 1, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [7.5, 7, 3.25],
            			"to": [8.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [2, 0, 3, 9], "texture": "#2"},
            				"east": {"uv": [2, 0, 3, 9], "texture": "#2"},
            				"south": {"uv": [2, 0, 3, 9], "texture": "#2"},
            				"west": {"uv": [2, 0, 3, 9], "texture": "#2"},
            				"up": {"uv": [3, 1, 2, 0], "texture": "#2"},
            				"down": {"uv": [3, 0, 2, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [9.5, 7, 3.25],
            			"to": [10.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [3, 0, 4, 9], "texture": "#2"},
            				"east": {"uv": [3, 0, 4, 9], "texture": "#2"},
            				"south": {"uv": [3, 0, 4, 9], "texture": "#2"},
            				"west": {"uv": [3, 0, 4, 9], "texture": "#2"},
            				"up": {"uv": [4, 1, 3, 0], "texture": "#2"},
            				"down": {"uv": [4, 0, 3, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [11.5, 7, 3.25],
            			"to": [12.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [16, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [4, 0, 5, 9], "texture": "#2"},
            				"east": {"uv": [4, 0, 5, 9], "texture": "#2"},
            				"south": {"uv": [4, 0, 5, 9], "texture": "#2"},
            				"west": {"uv": [4, 0, 5, 9], "texture": "#2"},
            				"up": {"uv": [5, 1, 4, 0], "texture": "#2"},
            				"down": {"uv": [5, 0, 4, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"up": {"uv": [1, 8, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 8], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"up": {"uv": [1, 8, 0, 0], "texture": "#2"},
            				"down": {"uv": [1, 0, 0, 8], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [8, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [8, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 0.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 8, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#2"},
            				"up": {"uv": [8, 1, 0, 0], "texture": "#2"},
            				"down": {"uv": [8, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"from": [3.5, 8, 4.5],
            			"to": [12.5, 8.5, 12.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8, 4.75]},
            			"faces": {
            				"north": {"uv": [3, 3, 12, 3.5], "texture": "#0"},
            				"east": {"uv": [3, 3, 12, 3.5], "texture": "#0"},
            				"south": {"uv": [3, 3, 12, 3.5], "texture": "#0"},
            				"west": {"uv": [3, 3, 12, 3.5], "texture": "#0"},
            				"up": {"uv": [12, 12, 3, 3], "texture": "#0"},
            				"down": {"uv": [12, 3, 3, 12], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [15]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_DESK_CARPETED_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "minecraft:block/COLOR_NAME_wool",
            		"1": "LOG_NAME",
            		"2": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"name": "leg4",
            			"from": [10.5, 0, 4.5],
            			"to": [12, 7, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 3.5, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"name": "leg5",
            			"from": [10.5, 0, 10.5],
            			"to": [12, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 3.5, 11.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"name": "leg6",
            			"from": [4, 0, 10.5],
            			"to": [5.5, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 3.5, 11.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"name": "leg7",
            			"from": [4, 0, 4.5],
            			"to": [5.5, 7, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 3.5, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 7], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.7, 7, 4.25],
            			"to": [12.3, 8, 12.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 8.25]},
            			"faces": {
            				"north": {"uv": [4, 4, 12, 5], "texture": "#2"},
            				"east": {"uv": [4, 4, 12, 5], "texture": "#2"},
            				"south": {"uv": [4, 4, 12, 5], "texture": "#2"},
            				"west": {"uv": [4, 4, 12, 5], "texture": "#2"},
            				"up": {"uv": [12, 12, 4, 4], "texture": "#2"},
            				"down": {"uv": [12, 4, 4, 12], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.7, 12.25, 4.25],
            			"to": [12.3, 16.5, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.375, 4.625]},
            			"faces": {
            				"north": {"uv": [4, 4, 12, 8], "texture": "#2"},
            				"east": {"uv": [4, 4, 4.75, 8], "texture": "#2"},
            				"south": {"uv": [4, 4, 12, 8], "texture": "#2"},
            				"west": {"uv": [4, 4, 4.75, 8], "texture": "#2"},
            				"up": {"uv": [12, 4.75, 4, 4], "texture": "#2"},
            				"down": {"uv": [12, 4, 4, 4.75], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.75, 16, 3.5],
            			"to": [12.25, 17, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 16.5, 3.875]},
            			"faces": {
            				"north": {"uv": [0, 0, 9, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.75, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 9, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.75, 1], "texture": "#1"},
            				"up": {"uv": [9, 0.75, 0, 0], "texture": "#1"},
            				"down": {"uv": [9, 0, 0, 0.75], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [10.5, 7, 3.75],
            			"to": [11.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11, 11.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 9], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 9], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 9], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 9], "texture": "#1"},
            				"up": {"uv": [1, 0.5, 0, 0], "texture": "#1"},
            				"down": {"uv": [1, 0, 0, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [4.5, 7, 3.75],
            			"to": [5.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [5, 11.5, 4]},
            			"faces": {
            				"north": {"uv": [2, 0, 3, 9], "texture": "#1"},
            				"east": {"uv": [2, 0, 2.5, 9], "texture": "#1"},
            				"south": {"uv": [2, 0, 3, 9], "texture": "#1"},
            				"west": {"uv": [2, 0, 2.5, 9], "texture": "#1"},
            				"up": {"uv": [3, 0.5, 2, 0], "texture": "#1"},
            				"down": {"uv": [3, 0, 2, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [4.35, 5.25, 5.25],
            			"to": [5.15, 7, 10.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 6.125, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"up": {"uv": [1, 5, 0, 0], "texture": "#1"},
            				"down": {"uv": [1, 0, 0, 5], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [10.85, 5.25, 5.25],
            			"to": [11.65, 7, 10.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 6.125, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"up": {"uv": [1, 5, 0, 0], "texture": "#1"},
            				"down": {"uv": [1, 0, 0, 5], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5.25, 5.25, 10.85],
            			"to": [10.75, 7, 11.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6.125, 11.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"up": {"uv": [5, 1, 0, 0], "texture": "#1"},
            				"down": {"uv": [5, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5.25, 5.25, 4.85],
            			"to": [10.75, 7, 5.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6.125, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 2], "texture": "#1"},
            				"up": {"uv": [5, 1, 0, 0], "texture": "#1"},
            				"down": {"uv": [5, 0, 0, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 8, 4.5],
            			"to": [12, 8.3, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.15, 8.375]},
            			"faces": {
            				"north": {"uv": [4, 4, 12, 4.5], "texture": "#0"},
            				"east": {"uv": [4, 4, 12, 4.5], "texture": "#0"},
            				"south": {"uv": [4, 4, 12, 4.5], "texture": "#0"},
            				"west": {"uv": [4, 4, 12, 4.5], "texture": "#0"},
            				"up": {"uv": [12, 12, 4, 4], "texture": "#0"},
            				"down": {"uv": [12, 4, 4, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [4, 12.5, 5],
            			"to": [12, 16.15, 5.2],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.325, 5.1]},
            			"faces": {
            				"north": {"uv": [12, 4, 4, 8], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [4, 4, 8, 4.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [12, 8, 4, 4], "texture": "#0"},
            				"west": {"uv": [4, 4, 8, 4.5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4, 4, 12, 4.5], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [4, 4, 12, 4.5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [13, 14]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,form=normal,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 }
              }
            }
            """;

    public static final String SIMPLE_BENCH_NORMAL_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "LOG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LOG_NAME"
            	},
            	"elements": [
            		{
            			"from": [12, 0, 9.75],
            			"to": [14, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4.25],
            			"to": [14, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [11.8, 7.5, 2.8],
            			"to": [14.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"east": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"south": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"west": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"up": {"uv": [3, 16, 0.5, 5.5], "texture": "#0"},
            				"down": {"uv": [3, 5.5, 0.5, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 3.2],
            			"to": [13.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 5.45],
            			"to": [13.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 7.7],
            			"to": [13.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 9.95],
            			"to": [13.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 12.2],
            			"to": [13.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 9.75],
            			"to": [4, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 4.25],
            			"to": [4, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.8, 7.5, 2.8],
            			"to": [4.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"east": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"south": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"west": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"up": {"uv": [3, 16, 0.5, 5.5], "texture": "#0"},
            				"down": {"uv": [3, 5.5, 0.5, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 3.2],
            			"to": [3.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 9.95],
            			"to": [3.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 12.2],
            			"to": [3.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 5.45],
            			"to": [3.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 7.7],
            			"to": [3.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_CENTER_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"1": "BASE_NAME",
            		"particle": "LOG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_LEFT_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "LOG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LOG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 0, 9.75],
            			"to": [4, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 4.25],
            			"to": [4, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.8, 7.5, 2.8],
            			"to": [4.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"east": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"south": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"west": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"up": {"uv": [3, 16, 0.5, 5.5], "texture": "#0"},
            				"down": {"uv": [3, 5.5, 0.5, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 3.2],
            			"to": [3.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 9.95],
            			"to": [3.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 12.2],
            			"to": [3.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 5.45],
            			"to": [3.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 7.7],
            			"to": [3.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_RIGHT_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "LOG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LOG_NAME"
            	},
            	"elements": [
            		{
            			"from": [12, 0, 9.75],
            			"to": [14, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4.25],
            			"to": [14, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [11.8, 7.5, 2.8],
            			"to": [14.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"east": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"south": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"west": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"up": {"uv": [3, 16, 0.5, 5.5], "texture": "#0"},
            				"down": {"uv": [3, 5.5, 0.5, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 3.2],
            			"to": [13.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 5.45],
            			"to": [13.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 7.7],
            			"to": [13.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 9.95],
            			"to": [13.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 12.2],
            			"to": [13.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_NORMAL_BACKREST_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "LOG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LOG_NAME"
            	},
            	"elements": [
            		{
            			"from": [12, 0, 9.75],
            			"to": [14, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4.25],
            			"to": [14, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [11.8, 7.5, 2.8],
            			"to": [14.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"east": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"south": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"west": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"up": {"uv": [3, 16, 0.5, 5.5], "texture": "#0"},
            				"down": {"uv": [3, 5.5, 0.5, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 3.2],
            			"to": [13.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 5.45],
            			"to": [13.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 7.7],
            			"to": [13.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 9.95],
            			"to": [13.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 12.2],
            			"to": [13.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 11.1625, 0.4875],
            			"to": [16, 12.9625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 13.4125, 0.4875],
            			"to": [16, 15.2125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15.6625, 0.4875],
            			"to": [16, 17.4625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 17.9125, 0.4875],
            			"to": [16, 19.7125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [11.9, 7.1125, -0.0125],
            			"to": [14.1, 19.5125, 0.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 3.5, 0.5, 16], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0.5, 3.5, 13, 4], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [3, 16, 0.5, 3.5], "texture": "#0"},
            				"west": {"uv": [0.5, 3.5, 13, 4], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0.5, 3.5, 3, 4], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0.5, 3.5, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 18.5125, 1.4875],
            			"to": [13.3, 19.1125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 7, 2.75, 7.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [1.5, 7, 1.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 16.2625, 1.4875],
            			"to": [13.3, 16.8625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 4.25, 7, 4.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [3, 7, 3.25, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 14.0125, 1.4875],
            			"to": [13.3, 14.6125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5, 7, 5.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4.5, 7, 4.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 11.7625, 1.4875],
            			"to": [13.3, 12.3625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5.75, 7, 6], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [5.25, 7, 5.5, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.9, 7.1125, -0.0125],
            			"to": [4.1, 19.5125, 0.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 3.5, 0.5, 16], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0.5, 3.5, 13, 4], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [3, 16, 0.5, 3.5], "texture": "#0"},
            				"west": {"uv": [0.5, 3.5, 13, 4], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0.5, 3.5, 3, 4], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0.5, 3.5, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 9.75],
            			"to": [4, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 4.25],
            			"to": [4, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.8, 7.5, 2.8],
            			"to": [4.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"east": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"south": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"west": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"up": {"uv": [3, 16, 0.5, 5.5], "texture": "#0"},
            				"down": {"uv": [3, 5.5, 0.5, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 11.7625, 1.4875],
            			"to": [3.3, 12.3625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5.75, 7, 6], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [5.25, 7, 5.5, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 14.0125, 1.4875],
            			"to": [3.3, 14.6125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5, 7, 5.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4.5, 7, 4.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 3.2],
            			"to": [3.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 9.95],
            			"to": [3.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 12.2],
            			"to": [3.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 5.45],
            			"to": [3.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 16.2625, 1.4875],
            			"to": [3.3, 16.8625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 4.25, 7, 4.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [3, 7, 3.25, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 18.5125, 1.4875],
            			"to": [3.3, 19.1125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 7, 2.75, 7.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [1.5, 7, 1.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 7.7],
            			"to": [3.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_CENTER_BACKREST_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"1": "BASE_NAME",
            		"particle": "LOG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 11.1625, 0.4875],
            			"to": [16, 12.9625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 13.4125, 0.4875],
            			"to": [16, 15.2125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15.6625, 0.4875],
            			"to": [16, 17.4625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 17.9125, 0.4875],
            			"to": [16, 19.7125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_LEFT_BACKREST_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "LOG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LOG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 11.1625, 0.4875],
            			"to": [16, 12.9625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 13.4125, 0.4875],
            			"to": [16, 15.2125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15.6625, 0.4875],
            			"to": [16, 17.4625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 17.9125, 0.4875],
            			"to": [16, 19.7125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1.9, 7.1125, -0.0125],
            			"to": [4.1, 19.5125, 0.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 3.5, 0.5, 16], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0.5, 3.5, 13, 4], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [3, 16, 0.5, 3.5], "texture": "#0"},
            				"west": {"uv": [0.5, 3.5, 13, 4], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0.5, 3.5, 3, 4], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0.5, 3.5, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 9.75],
            			"to": [4, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 4.25],
            			"to": [4, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.8, 7.5, 2.8],
            			"to": [4.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"east": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"south": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"west": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"up": {"uv": [3, 16, 0.5, 5.5], "texture": "#0"},
            				"down": {"uv": [3, 5.5, 0.5, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 11.7625, 1.4875],
            			"to": [3.3, 12.3625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5.75, 7, 6], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [5.25, 7, 5.5, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 14.0125, 1.4875],
            			"to": [3.3, 14.6125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5, 7, 5.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4.5, 7, 4.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 3.2],
            			"to": [3.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 9.95],
            			"to": [3.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 12.2],
            			"to": [3.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 5.45],
            			"to": [3.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 16.2625, 1.4875],
            			"to": [3.3, 16.8625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 4.25, 7, 4.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [3, 7, 3.25, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 18.5125, 1.4875],
            			"to": [3.3, 19.1125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [-2, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 7, 2.75, 7.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [1.5, 7, 1.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 7.7],
            			"to": [3.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_RIGHT_BACKREST_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "LOG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LOG_NAME"
            	},
            	"elements": [
            		{
            			"from": [12, 0, 9.75],
            			"to": [14, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4.25],
            			"to": [14, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"east": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"south": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"west": {"uv": [0, 5.5, 2, 13], "texture": "#0"},
            				"up": {"uv": [2, 7.5, 0, 5.5], "texture": "#0"},
            				"down": {"uv": [2, 5.5, 0, 7.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"east": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"south": {"uv": [0, 10, 16, 11], "texture": "#1"},
            				"west": {"uv": [0, 10, 1.5, 11], "texture": "#1"},
            				"up": {"uv": [16, 11.5, 0, 10], "texture": "#1"},
            				"down": {"uv": [16, 10, 0, 11.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [11.8, 7.5, 2.8],
            			"to": [14.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"east": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"south": {"uv": [0.5, 5.5, 3, 6], "texture": "#0"},
            				"west": {"uv": [0.5, 5.5, 11, 6], "texture": "#0"},
            				"up": {"uv": [3, 16, 0.5, 5.5], "texture": "#0"},
            				"down": {"uv": [3, 5.5, 0.5, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 3.2],
            			"to": [13.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 5.45],
            			"to": [13.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 7.7],
            			"to": [13.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 9.95],
            			"to": [13.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 12.2],
            			"to": [13.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 11.1625, 0.4875],
            			"to": [16, 12.9625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 13.4125, 0.4875],
            			"to": [16, 15.2125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15.6625, 0.4875],
            			"to": [16, 17.4625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 17.9125, 0.4875],
            			"to": [16, 19.7125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [16, 4, 0, 5.5], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 4, 1.5, 5], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [16, 5.5, 0, 4], "texture": "#1"},
            				"west": {"uv": [0, 4, 1.5, 5], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 4, 16, 5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 4, 16, 5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [11.9, 7.1125, -0.0125],
            			"to": [14.1, 19.5125, 0.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 3.5, 0.5, 16], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0.5, 3.5, 13, 4], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [3, 16, 0.5, 3.5], "texture": "#0"},
            				"west": {"uv": [0.5, 3.5, 13, 4], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0.5, 3.5, 3, 4], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0.5, 3.5, 3, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 18.5125, 1.4875],
            			"to": [13.3, 19.1125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 7, 2.75, 7.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [1.5, 7, 1.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 16.2625, 1.4875],
            			"to": [13.3, 16.8625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 4.25, 7, 4.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [3, 7, 3.25, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 14.0125, 1.4875],
            			"to": [13.3, 14.6125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5, 7, 5.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4.5, 7, 4.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 11.7625, 1.4875],
            			"to": [13.3, 12.3625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5.75, 7, 6], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [5.25, 7, 5.5, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]
            		}
            	]
            }
            """;

    public static final String STONE_BENCH_NORMAL_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "block/smooth_stone",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [14, 0, 2.98],
            			"to": [16, 8.72, 12.48],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 9], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 9], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 9], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 9], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 8.7, 4.75],
            			"to": [16, 10.485, 10.72],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [2, 6, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.999, 4.84629, 10.83088],
            			"to": [16.001, 7.34629, 12.33088],
            			"rotation": {"angle": -45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 1.5, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"west": {"uv": [0.5, 0, 2, 2.5], "texture": "#0"},
            				"up": {"uv": [8, 4, 7.5, 3.5], "texture": "#0"},
            				"down": {"uv": [8, 4, 7.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.999, 7.82322, 3.64393],
            			"to": [16.001, 10.32322, 5.14393],
            			"rotation": {"angle": 45, "axis": "x", "origin": [15, 9.07322, 4.39393]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"east": {"uv": [0.5, 0, 2, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 1.5, 2.5], "texture": "#0"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 2.98],
            			"to": [2, 8.72, 12.48],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-6.00025, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 9], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 9], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 9], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 9], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8.7, 4.75],
            			"to": [2, 10.485, 10.72],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-6.00025, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [2, 6, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.001, 4.84629, 10.83088],
            			"to": [2.001, 7.34629, 12.33088],
            			"rotation": {"angle": -45, "axis": "x", "origin": [-6.00025, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 1.5, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"west": {"uv": [0.5, 0, 2, 2.5], "texture": "#0"},
            				"up": {"uv": [8, 4, 7.5, 3.5], "texture": "#0"},
            				"down": {"uv": [8, 4, 7.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.001, 7.82322, 3.64393],
            			"to": [2.001, 10.32322, 5.14393],
            			"rotation": {"angle": 45, "axis": "x", "origin": [1, 9.07322, 4.39393]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"east": {"uv": [0.5, 0, 2, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 1.5, 2.5], "texture": "#0"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 7.5, 3.28],
            			"to": [14, 9, 12.18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [2, 2, 14, 3.5], "texture": "#1"},
            				"east": {"uv": [2, 2, 11, 3.5], "texture": "#1"},
            				"south": {"uv": [2, 2, 14, 3.5], "texture": "#1"},
            				"west": {"uv": [2, 2, 11, 3.5], "texture": "#1"},
            				"up": {"uv": [14, 11, 2, 2], "texture": "#1"},
            				"down": {"uv": [14, 2, 2, 11], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [
            				{
            					"name": "side1",
            					"origin": [15, 8.25, 4.5],
            					"color": 0,
            					"children": [0, 1, 2, 3]
            				},
            				{
            					"name": "side2",
            					"origin": [15, 8.25, 4.5],
            					"color": 0,
            					"children": [4, 5, 6, 7]
            				},
            				8
            			]
            		}
            	]
            }
            """;

    public static final String STONE_BENCH_CENTER_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"1": "block/smooth_stone",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7.5, 3.28],
            			"to": [16, 9, 12.18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [1, 2, 15, 3.5], "texture": "#1"},
            				"east": {"uv": [2, 2, 11, 3.5], "texture": "#1"},
            				"south": {"uv": [1, 2, 15, 3.5], "texture": "#1"},
            				"west": {"uv": [2, 2, 11, 3.5], "texture": "#1"},
            				"up": {"uv": [15, 11, 1, 2], "texture": "#1"},
            				"down": {"uv": [15, 2, 1, 11], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0]
            		}
            	]
            }
            """;

    public static final String STONE_BENCH_LEFT_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "block/smooth_stone",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 2.98],
            			"to": [2, 8.72, 12.48],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-6.00025, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 9], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 9], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 9], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 9], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8.7, 4.75],
            			"to": [2, 10.485, 10.72],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-6.00025, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [2, 6, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.001, 4.84629, 10.83088],
            			"to": [2.001, 7.34629, 12.33088],
            			"rotation": {"angle": -45, "axis": "x", "origin": [-6.00025, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 1.5, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"west": {"uv": [0.5, 0, 2, 2.5], "texture": "#0"},
            				"up": {"uv": [8, 4, 7.5, 3.5], "texture": "#0"},
            				"down": {"uv": [8, 4, 7.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.001, 7.82322, 3.64393],
            			"to": [2.001, 10.32322, 5.14393],
            			"rotation": {"angle": 45, "axis": "x", "origin": [1, 9.07322, 4.39393]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"east": {"uv": [0.5, 0, 2, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 1.5, 2.5], "texture": "#0"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 7.5, 3.28],
            			"to": [16, 9, 12.18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [1, 2, 15, 3.5], "texture": "#1"},
            				"east": {"uv": [2, 2, 11, 3.5], "texture": "#1"},
            				"south": {"uv": [1, 2, 15, 3.5], "texture": "#1"},
            				"west": {"uv": [2, 2, 11, 3.5], "texture": "#1"},
            				"up": {"uv": [15, 11, 1, 2], "texture": "#1"},
            				"down": {"uv": [15, 2, 1, 11], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [
            				{
            					"name": "side2",
            					"origin": [15, 8.25, 4.5],
            					"color": 0,
            					"children": [0, 1, 2, 3]
            				},
            				4
            			]
            		}
            	]
            }
            """;

    public static final String STONE_BENCH_RIGHT_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "block/smooth_stone",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [14, 0, 2.98],
            			"to": [16, 8.72, 12.48],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 9], "texture": "#0"},
            				"east": {"uv": [0, 0, 10, 9], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 9], "texture": "#0"},
            				"west": {"uv": [0, 0, 10, 9], "texture": "#0"},
            				"up": {"uv": [2, 10, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 8.7, 4.75],
            			"to": [16, 10.485, 10.72],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [2, 6, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.999, 4.84629, 10.83088],
            			"to": [16.001, 7.34629, 12.33088],
            			"rotation": {"angle": -45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 1.5, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"west": {"uv": [0.5, 0, 2, 2.5], "texture": "#0"},
            				"up": {"uv": [8, 4, 7.5, 3.5], "texture": "#0"},
            				"down": {"uv": [8, 4, 7.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.999, 7.82322, 3.64393],
            			"to": [16.001, 10.32322, 5.14393],
            			"rotation": {"angle": 45, "axis": "x", "origin": [15, 9.07322, 4.39393]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"east": {"uv": [0.5, 0, 2, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 1.5, 2.5], "texture": "#0"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#0"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7.5, 3.28],
            			"to": [14, 9, 12.18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [1, 2, 15, 3.5], "texture": "#1"},
            				"east": {"uv": [2, 2, 11, 3.5], "texture": "#1"},
            				"south": {"uv": [1, 2, 15, 3.5], "texture": "#1"},
            				"west": {"uv": [2, 2, 11, 3.5], "texture": "#1"},
            				"up": {"uv": [15, 11, 1, 2], "texture": "#1"},
            				"down": {"uv": [15, 2, 1, 11], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [
            				{
            					"name": "side1",
            					"origin": [15, 8.25, 4.5],
            					"color": 0,
            					"children": [0, 1, 2, 3]
            				},
            				{
            					"name": "side2",
            					"origin": [15, 8.25, 4.5],
            					"color": 0,
            					"children": []
            				},
            				4
            			]
            		}
            	]
            }
            """;

    public static final String SOFA_NORMAL_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"1": "block/cyan_terracotta",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 2, 1],
            			"to": [15, 7, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 5], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 5], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 5], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 5], "texture": "#0"},
            				"up": {"uv": [14, 14, 0, 0], "texture": "#0"},
            				"down": {"uv": [14, 0, 0, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 8], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 8], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"up": {"uv": [14, 4, 0, 0], "texture": "#0"},
            				"down": {"uv": [14, 0, 0, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.25, 7, 5],
            			"to": [4.75, 10.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
            				"up": {"uv": [3.5, 9, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 0, 0, 9], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11.25, 7, 5],
            			"to": [14.75, 10.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.25, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
            				"up": {"uv": [3.5, 9, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 0, 0, 9], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 12],
            			"to": [14, 2, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 0, 12],
            			"to": [4, 2, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 0, 2],
            			"to": [4, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12, 0, 2],
            			"to": [14, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
            				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static final String SOFA_CENTER_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
              		{
              			"from": [0, 2, 1],
              			"to": [16, 7, 15],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 5], "texture": "#0"},
              				"east": {"uv": [0, 0, 14, 5], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 5], "texture": "#0"},
              				"west": {"uv": [0, 0, 14, 5], "texture": "#0"},
              				"up": {"uv": [16, 14, 0, 0], "texture": "#0"},
              				"down": {"uv": [16, 0, 0, 14], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 7, 1],
              			"to": [16, 15, 5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
              			"faces": {
              				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
              				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
              				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
              				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
              				"up": {"uv": [16, 4, 0, 0], "texture": "#0"},
              				"down": {"uv": [16, 0, 0, 4], "texture": "#0"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"thirdperson_lefthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"firstperson_righthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"firstperson_lefthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"ground": {
              			"translation": [0, 1.5, 0],
              			"scale": [0.4, 0.4, 0.4]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"translation": [0, 0.25, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [0, 90, 0],
              			"translation": [0, 0, 0.75],
              			"scale": [0.6, 0.6, 0.6]
              		}
              	},
              	"groups": [
              		{
              			"name": "sofa",
              			"origin": [8, 8, 8],
              			"color": 0,
              			"children": [0, 1]
              		}
              	]
            }
            """;

    public static final String SOFA_LEFT_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"1": "block/cyan_terracotta",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
              		{
              			"from": [1, 2, 1],
              			"to": [16, 7, 15],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
              			"faces": {
              				"north": {"uv": [0, 0, 15, 5], "texture": "#0"},
              				"east": {"uv": [0, 0, 14, 5], "texture": "#0"},
              				"south": {"uv": [0, 0, 15, 5], "texture": "#0"},
              				"west": {"uv": [0, 0, 14, 5], "texture": "#0"},
              				"up": {"uv": [15, 14, 0, 0], "texture": "#0"},
              				"down": {"uv": [15, 0, 0, 14], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1, 7, 1],
              			"to": [16, 15, 5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
              			"faces": {
              				"north": {"uv": [0, 0, 15, 8], "texture": "#0"},
              				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
              				"south": {"uv": [0, 0, 15, 8], "texture": "#0"},
              				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
              				"up": {"uv": [15, 4, 0, 0], "texture": "#0"},
              				"down": {"uv": [15, 0, 0, 4], "texture": "#0"}
              			}
              		},
              		{
              			"from": [1.25, 7, 5],
              			"to": [4.75, 10.5, 14],
              			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 9, 9.5]},
              			"faces": {
              				"north": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
              				"east": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
              				"south": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
              				"west": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
              				"up": {"uv": [3.5, 9, 0, 0], "texture": "#0"},
              				"down": {"uv": [3.5, 0, 0, 9], "texture": "#0"}
              			}
              		},
              		{
              			"from": [2, 0, 12],
              			"to": [4, 2, 14],
              			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 13]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
              				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
              				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
              				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
              				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
              				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
              			}
              		},
              		{
              			"from": [2, 0, 2],
              			"to": [4, 2, 4],
              			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
              			"faces": {
              				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
              				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
              				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
              				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
              				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
              				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"thirdperson_lefthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"firstperson_righthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"firstperson_lefthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"ground": {
              			"translation": [0, 1.5, 0],
              			"scale": [0.4, 0.4, 0.4]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"translation": [0, 0.25, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [0, 90, 0],
              			"translation": [0, 0, 0.75],
              			"scale": [0.6, 0.6, 0.6]
              		}
              	},
              	"groups": [
              		{
              			"name": "sofa",
              			"origin": [8, 8, 8],
              			"color": 0,
              			"children": [0, 1, 2, 3, 4]
              		}
              	]
            }
            """;

    public static final String SOFA_RIGHT_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"1": "block/cyan_terracotta",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 2, 1],
             			"to": [15, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 5], "texture": "#0"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"south": {"uv": [0, 0, 15, 5], "texture": "#0"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"up": {"uv": [15, 14, 0, 0], "texture": "#0"},
             				"down": {"uv": [15, 0, 0, 14], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 7, 1],
             			"to": [15, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 8], "texture": "#0"},
             				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"south": {"uv": [0, 0, 15, 8], "texture": "#0"},
             				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"up": {"uv": [15, 4, 0, 0], "texture": "#0"},
             				"down": {"uv": [15, 0, 0, 4], "texture": "#0"}
             			}
             		},
             		{
             			"from": [11.25, 7, 5],
             			"to": [14.75, 10.5, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13.25, 9, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"up": {"uv": [3.5, 9, 0, 0], "texture": "#0"},
             				"down": {"uv": [3.5, 0, 0, 9], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 0, 12],
             			"to": [14, 2, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 13]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 2],
             			"to": [14, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4]
             		}
             	]
            }
            """;

    public static final String SOFA_LEFTCORNER_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "block/cyan_terracotta",
            		"1": "COLOR_NAME",
            		"particle": "block/cyan_terracotta"
            	},
            	"elements": [
             		{
             			"from": [1, 2, 1],
             			"to": [15, 7, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 5], "texture": "#1"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"south": {"uv": [0, 0, 15, 5], "texture": "#1"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"up": {"uv": [15, 14, 0, 0], "texture": "#1"},
             				"down": {"uv": [15, 0, 0, 14], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2.0025, 1.001],
             			"to": [16, 6.9975, 15.002],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 4, 0.1]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"up": {"uv": [14, 14, 0, 0], "texture": "#1"},
             				"down": {"uv": [14, 0, 0, 14], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 7, 1],
             			"to": [16, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 8], "texture": "#1"},
             				"east": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"south": {"uv": [0, 0, 15, 8], "texture": "#1"},
             				"west": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"up": {"uv": [15, 4, 0, 0], "texture": "#1"},
             				"down": {"uv": [15, 0, 0, 4], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 11, 5],
             			"to": [5, 15, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2.95, 13.5, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"east": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"south": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"west": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"up": {"uv": [4, 11, 0, 0], "texture": "#1"},
             				"down": {"uv": [4, 0, 0, 11], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 7, 5],
             			"to": [5, 11, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2.95, 9.5, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"east": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"south": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"west": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"up": {"uv": [4, 11, 0, 0], "texture": "#1"},
             				"down": {"uv": [4, 0, 0, 11], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 2],
             			"to": [4, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#0"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5]
             		}
             	]
            }
            """;

    public static final String SOFA_RIGHTCORNER_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "block/cyan_terracotta",
            		"1": "COLOR_NAME",
            		"particle": "block/cyan_terracotta"
            	},
            	"elements": [
             		{
             			"from": [0, 2, 1],
             			"to": [15, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 5], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 5], "texture": "#1"},
             				"up": {"uv": [15, 14, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [15, 0, 0, 14], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [0.998, 2.0025, 2],
             			"to": [14.999, 6.9975, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"up": {"uv": [14, 14, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [14, 0, 0, 14], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [11, 7, 1],
             			"to": [15, 15, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 8], "texture": "#1"},
             				"south": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 8], "texture": "#1"},
             				"up": {"uv": [15, 4, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [15, 0, 0, 4], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [0, 11, 1],
             			"to": [11, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"east": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"south": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"west": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"up": {"uv": [4, 11, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [4, 0, 0, 11], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [0, 7, 1],
             			"to": [11, 11, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"east": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"south": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"west": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"up": {"uv": [4, 11, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [4, 0, 0, 11], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 2],
             			"to": [14, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"up": {"uv": [2, 2, 0, 0], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [2, 0, 0, 2], "rotation": 270, "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5]
             		}
             	]
            }
            """;

    public static final String SOFA_NORMAL_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"1": "block/cyan_terracotta",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
             		{
             			"from": [1, 2, 1],
             			"to": [15, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"south": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"up": {"uv": [14, 14, 0, 0], "texture": "#0"},
             				"down": {"uv": [14, 0, 0, 14], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 7, 1],
             			"to": [15, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 8], "texture": "#0"},
             				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"south": {"uv": [0, 0, 14, 8], "texture": "#0"},
             				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"up": {"uv": [14, 4, 0, 0], "texture": "#0"},
             				"down": {"uv": [14, 0, 0, 4], "texture": "#0"}
             			}
             		},
             		{
             			"from": [5, 7, 5],
             			"to": [11, 13, 8],
             			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 11, 7]},
             			"faces": {
             				"north": {"uv": [0, 0, 6, 6], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
             				"south": {"uv": [0, 0, 6, 6], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
             				"up": {"uv": [6, 3, 0, 0], "texture": "#0"},
             				"down": {"uv": [6, 0, 0, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 7, 5],
             			"to": [4.75, 10.5, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 9, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"up": {"uv": [3.5, 9, 0, 0], "texture": "#0"},
             				"down": {"uv": [3.5, 0, 0, 9], "texture": "#0"}
             			}
             		},
             		{
             			"from": [11.25, 7, 5],
             			"to": [14.75, 10.5, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13.25, 9, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"up": {"uv": [3.5, 9, 0, 0], "texture": "#0"},
             				"down": {"uv": [3.5, 0, 0, 9], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 0, 12],
             			"to": [14, 2, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 13]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 12],
             			"to": [4, 2, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 13]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 2],
             			"to": [4, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 2],
             			"to": [14, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
             		}
             	]
            }
            """;

    public static final String SOFA_CENTER_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 2, 1],
             			"to": [16, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 5], "texture": "#0"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 5], "texture": "#0"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"up": {"uv": [16, 14, 0, 0], "texture": "#0"},
             				"down": {"uv": [16, 0, 0, 14], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 7, 1],
             			"to": [16, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
             				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
             				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"up": {"uv": [16, 4, 0, 0], "texture": "#0"},
             				"down": {"uv": [16, 0, 0, 4], "texture": "#0"}
             			}
             		},
             		{
             			"from": [5, 7, 5],
             			"to": [11, 13, 8],
             			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 11, 7]},
             			"faces": {
             				"north": {"uv": [0, 0, 6, 6], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
             				"south": {"uv": [0, 0, 6, 6], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
             				"up": {"uv": [6, 3, 0, 0], "texture": "#0"},
             				"down": {"uv": [6, 0, 0, 3], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2]
             		}
             	]
            }
            """;

    public static final String SOFA_LEFT_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"1": "block/cyan_terracotta",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
             		{
             			"from": [1, 2, 1],
             			"to": [16, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 5], "texture": "#0"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"south": {"uv": [0, 0, 15, 5], "texture": "#0"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"up": {"uv": [15, 14, 0, 0], "texture": "#0"},
             				"down": {"uv": [15, 0, 0, 14], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 7, 1],
             			"to": [16, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 8], "texture": "#0"},
             				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"south": {"uv": [0, 0, 15, 8], "texture": "#0"},
             				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"up": {"uv": [15, 4, 0, 0], "texture": "#0"},
             				"down": {"uv": [15, 0, 0, 4], "texture": "#0"}
             			}
             		},
             		{
             			"from": [5, 7, 5],
             			"to": [11, 13, 8],
             			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 11, 7]},
             			"faces": {
             				"north": {"uv": [0, 0, 6, 6], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
             				"south": {"uv": [0, 0, 6, 6], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
             				"up": {"uv": [6, 3, 0, 0], "texture": "#0"},
             				"down": {"uv": [6, 0, 0, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.25, 7, 5],
             			"to": [4.75, 10.5, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 9, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"up": {"uv": [3.5, 9, 0, 0], "texture": "#0"},
             				"down": {"uv": [3.5, 0, 0, 9], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 0, 12],
             			"to": [4, 2, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 13]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 2],
             			"to": [4, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5]
             		}
             	]
            }
            """;

    public static final String SOFA_RIGHT_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "COLOR_NAME",
            		"1": "block/cyan_terracotta",
            		"particle": "COLOR_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 2, 1],
             			"to": [15, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 5], "texture": "#0"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"south": {"uv": [0, 0, 15, 5], "texture": "#0"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#0"},
             				"up": {"uv": [15, 14, 0, 0], "texture": "#0"},
             				"down": {"uv": [15, 0, 0, 14], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 7, 1],
             			"to": [15, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 8], "texture": "#0"},
             				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"south": {"uv": [0, 0, 15, 8], "texture": "#0"},
             				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
             				"up": {"uv": [15, 4, 0, 0], "texture": "#0"},
             				"down": {"uv": [15, 0, 0, 4], "texture": "#0"}
             			}
             		},
             		{
             			"from": [5, 7, 5],
             			"to": [11, 13, 8],
             			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 11, 7]},
             			"faces": {
             				"north": {"uv": [0, 0, 6, 6], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
             				"south": {"uv": [0, 0, 6, 6], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
             				"up": {"uv": [6, 3, 0, 0], "texture": "#0"},
             				"down": {"uv": [6, 0, 0, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [11.25, 7, 5],
             			"to": [14.75, 10.5, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13.25, 9, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 3.5, 3.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 9, 3.5], "texture": "#0"},
             				"up": {"uv": [3.5, 9, 0, 0], "texture": "#0"},
             				"down": {"uv": [3.5, 0, 0, 9], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 0, 12],
             			"to": [14, 2, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 13]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 2],
             			"to": [14, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#1"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#1"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#1"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5]
             		}
             	]
            }
            """;

    public static final String SOFA_LEFTCORNER_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "block/cyan_terracotta",
            		"1": "COLOR_NAME",
            		"particle": "block/cyan_terracotta"
            	},
            	"elements": [
             		{
             			"from": [1, 2, 1],
             			"to": [15, 7, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 5], "texture": "#1"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"south": {"uv": [0, 0, 15, 5], "texture": "#1"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"up": {"uv": [15, 14, 0, 0], "texture": "#1"},
             				"down": {"uv": [15, 0, 0, 14], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 2.0025, 1.001],
             			"to": [16, 6.9975, 15.002],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 4, 0.1]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"up": {"uv": [14, 14, 0, 0], "texture": "#1"},
             				"down": {"uv": [14, 0, 0, 14], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 7, 1],
             			"to": [16, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 15, 8], "texture": "#1"},
             				"east": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"south": {"uv": [0, 0, 15, 8], "texture": "#1"},
             				"west": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"up": {"uv": [15, 4, 0, 0], "texture": "#1"},
             				"down": {"uv": [15, 0, 0, 4], "texture": "#1"}
             			}
             		},
             		{
             			"from": [3, 7, 6],
             			"to": [11, 15.001, 10],
             			"rotation": {"angle": 45, "axis": "y", "origin": [5, 11, 8]},
             			"faces": {
             				"north": {"uv": [0, 0, 8, 8], "texture": "#1"},
             				"east": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"south": {"uv": [0, 0, 8, 8], "texture": "#1"},
             				"west": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"up": {"uv": [8, 4, 0, 0], "texture": "#1"},
             				"down": {"uv": [8, 0, 0, 4], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 11, 5],
             			"to": [5, 15, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2.95, 13.5, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"east": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"south": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"west": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"up": {"uv": [4, 11, 0, 0], "texture": "#1"},
             				"down": {"uv": [4, 0, 0, 11], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 7, 5],
             			"to": [5, 11, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2.95, 9.5, 9.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"east": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"south": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"west": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"up": {"uv": [4, 11, 0, 0], "texture": "#1"},
             				"down": {"uv": [4, 0, 0, 11], "texture": "#1"}
             			}
             		},
             		{
             			"from": [2, 0, 2],
             			"to": [4, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"up": {"uv": [2, 2, 0, 0], "texture": "#0"},
             				"down": {"uv": [2, 0, 0, 2], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5, 6]
             		}
             	]
            }
            """;

    public static final String SOFA_RIGHTCORNER_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "block/cyan_terracotta",
            		"1": "COLOR_NAME",
            		"particle": "block/cyan_terracotta"
            	},
            	"elements": [
             		{
             			"from": [0, 2, 1],
             			"to": [15, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 5], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 5], "texture": "#1"},
             				"up": {"uv": [15, 14, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [15, 0, 0, 14], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [0.998, 2.0025, 2],
             			"to": [14.999, 6.9975, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"east": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"west": {"uv": [0, 0, 14, 5], "texture": "#1"},
             				"up": {"uv": [14, 14, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [14, 0, 0, 14], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [11, 7, 1],
             			"to": [15, 15, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 8], "texture": "#1"},
             				"south": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 8], "texture": "#1"},
             				"up": {"uv": [15, 4, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [15, 0, 0, 4], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [7.07322, 7, 2.40901],
             			"to": [11.07322, 15.001, 10.40901],
             			"rotation": {"angle": 45, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"east": {"uv": [0, 0, 8, 8], "texture": "#1"},
             				"south": {"uv": [0, 0, 4, 8], "texture": "#1"},
             				"west": {"uv": [0, 0, 8, 8], "texture": "#1"},
             				"up": {"uv": [8, 4, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [8, 0, 0, 4], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [0, 11, 1],
             			"to": [11, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"east": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"south": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"west": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"up": {"uv": [4, 11, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [4, 0, 0, 11], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [0, 7, 1],
             			"to": [11, 11, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"east": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"south": {"uv": [0, 0, 11, 4], "texture": "#1"},
             				"west": {"uv": [0, 0, 4, 4], "texture": "#1"},
             				"up": {"uv": [4, 11, 0, 0], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [4, 0, 0, 11], "rotation": 270, "texture": "#1"}
             			}
             		},
             		{
             			"from": [12, 0, 2],
             			"to": [14, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9.25, 7, 6]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 2], "texture": "#0"},
             				"up": {"uv": [2, 2, 0, 0], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [2, 0, 0, 2], "rotation": 270, "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5, 6]
             		}
             	]
            }
            """;

    public static String SEATING_LOG = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [2, 0, 5],
            			"to": [14, 6, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 3, 8]},
            			"faces": {
            				"north": {"uv": [5, 2, 11, 14], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [5, 5, 11, 11], "texture": "#1"},
            				"south": {"uv": [5, 2, 11, 14], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [5, 5, 11, 11], "texture": "#1"},
            				"up": {"uv": [5, 2, 11, 14], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [5, 2, 11, 14], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 4, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 4, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 5, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 5, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 3, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"fixed": {
            			"translation": [0, 2.75, 0],
            			"scale": [0.75, 0.75, 0.75]
            		}
            	}
            }
            """;

    public static String SEATING_LOG_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [2, 0, 5],
            			"to": [16, 6, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 3, 8]},
            			"faces": {
            				"north": {"uv": [5, 1, 11, 15], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [5, 5, 11, 11], "texture": "#1"},
            				"south": {"uv": [5, 1, 11, 15], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [5, 5, 11, 11], "texture": "#1"},
            				"up": {"uv": [5, 1, 11, 15], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [5, 1, 11, 15], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 4, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 4, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 5, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 5, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 3, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"fixed": {
            			"translation": [0, 2.75, 0],
            			"scale": [0.75, 0.75, 0.75]
            		}
            	}
            }
            """;

    public static String SEATING_LOG_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 5],
            			"to": [14, 6, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 3, 8]},
            			"faces": {
            				"north": {"uv": [5, 1, 11, 15], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [5, 5, 11, 11], "texture": "#1"},
            				"south": {"uv": [5, 1, 11, 15], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [5, 5, 11, 11], "texture": "#1"},
            				"up": {"uv": [5, 1, 11, 15], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [5, 1, 11, 15], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 4, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 4, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 5, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 5, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 3, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"fixed": {
            			"translation": [0, 2.75, 0],
            			"scale": [0.75, 0.75, 0.75]
            		}
            	}
            }
            """;

    public static String SEATING_LOG_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LOG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 5],
            			"to": [16, 6, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 3, 8]},
            			"faces": {
            				"north": {"uv": [5, 0, 11, 16], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [5, 5, 11, 11], "texture": "#1"},
            				"south": {"uv": [5, 0, 11, 16], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [5, 5, 11, 11], "texture": "#1"},
            				"up": {"uv": [5, 0, 11, 16], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [5, 0, 11, 16], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 4, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 4, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 5, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 5, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 3, 0],
            			"scale": [0.75, 0.75, 0.75]
            		},
            		"fixed": {
            			"translation": [0, 2.75, 0],
            			"scale": [0.75, 0.75, 0.75]
            		}
            	}
            }
            """;

    public static String SHAPED_RECIPE = """
            {
              "type": "minecraft:crafting_shaped",
              "category": "building",
              "key": {
                "#": {
                  "item": "INGREDIENT1_NAME"
                },
                "/": {
                  "item": "INGREDIENT2_NAME"
                }
              },
              "pattern": [
                PATTERN1
                PATTERN2
                PATTERN3
              ],
              "result": {
                "count": COUNT,
                "id": "aestheticseating:OUTPUT_NAME"
              }
            }
            """;
}
