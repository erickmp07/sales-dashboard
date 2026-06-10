import js from "@eslint/js";
import eslintPluginPrettierRecommended from "eslint-plugin-prettier/recommended";
import globals from "globals";
import { defineConfig } from "eslint/config";

export default defineConfig([
    {
        files: ["**/*.{js,mjs,cjs}"],
        plugins: { js },
        extends: ["js/recommended"],
        languageOptions: { globals: globals.node },
        rules: {
            //"prettier/recommended": "error",
            "class-method-use-this": "off",
            "no-param-reasign": "off",
            camelcase: "off",
            "no-unused-vars": [
                "error",
                {
                    argsIgnorePattern: "next",
                },
            ],
        },
    },
    eslintPluginPrettierRecommended,
]);
