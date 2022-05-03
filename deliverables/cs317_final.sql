DROP DATABASE IF EXISTS gigabyte;
CREATE DATABASE IF NOT EXISTS gigabyte;
use gigabyte;

-- ------------------------------------------------------------------------------------------------
-- Create the Tables
CREATE TABLE recipe (
	recipeName VARCHAR(100),
    recipeTotalTime INT,
    recipeServingSize INT,
    recipeCalories INT
);
CREATE TABLE instruction (
    recipeName VARCHAR(100),
	instructionStep INT,
    recipeInstruction TEXT(800)
);
CREATE TABLE ingredient (
    recipeName VARCHAR(100),
    ingredientName VARCHAR(30),
    ingredientQuantity INT,
    ingredientMeasurement VARCHAR(15)
);

-- ------------------------------------------------------------------------------------------------
-- Insert Data
-- recipeName, recipeTotalTime, recipeServingSize, recipeCalories
INSERT INTO recipe VALUES 
	('Chocolate Pretzel', 22, 40, 37),
	('Green Eggs and Ham', 15, 1, 210),
	('Beans and Cheese', 7, 2, 230),
	('One-pan Salmon with Roast Asparagus', 70, 2, 483);

-- recipeInstruction, instructionStep
INSERT INTO instruction VALUES
	('Chocolate Pretzel', 1,'Preheat oven to 175 degrees F ( 80 degrees C)'),
	('Chocolate Pretzel', 2,'Arrange pretzels on a baking sheet. Place a candy kiss on the center of each pretzel'),
	('Chocolate Pretzel', 3,'Warm pretzels in the preheated oven until candy kiss is shiny and slightly softened, 2 minutes'),
	('Chocolate Pretzel', 4,'Place a candy-coated chocolate piece atop the candy kiss on each pretzel; press down. Chill in the refrigerator for 10 minutes');

-- recipeName, ingredientName, ingredientQuantity, ingredientMeasurement
    INSERT INTO ingredient VALUES
    ('Chocolate Pretzel','Square Pretzels', 15,'ounce'),
	('Chocolate Pretzel','Hersheys Kisses', 8,'ounce'),
	('Chocolate Pretzel','M&M', 1.69,'ounce'),
	('Chocolate Pretzel','Corn', 2,'cob');
    
    SELECT 	recipeName, recipeTotalTime, recipeServingSize, recipeCalories
    FROM recipe 
    WHERE recipeCalories <= 300;
    
    SELECT  recipeName, instructionStep, recipeInstruction
    FROM instruction
    WHERE instructionStep <= 2;    
    
    SELECT     recipeName, ingredientName, ingredientQuantity, ingredientMeasurement
    FROM ingredient
    WHERE ingredientMeasurement = 'cob';
    
    
    
    UPDATE recipe 
    SET recipeTotalTime = 'QUICK'
    WHERE recipeTotalTime <= 10;
    
   SELECT *
   FROM recipe.recipeTotalTime;
   
   DELETE recipe
   FROM recipe;
