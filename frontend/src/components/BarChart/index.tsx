import React from "react";
import ReactApexChart from "react-apexcharts";

function BarChart() {
    const [state, _] = React.useState({
        series: [
            {
                name: "% Conversion",
                data: [43.6, 67.1, 67.7, 45.6, 71.1],
            },
        ],
        options: {
            chart: {
                type: "bar" as const,
                height: 240,
            },
            plotOptions: {
                bar: {
                    borderRadius: 4,
                    borderRadiusApplication: "end" as const,
                    horizontal: true,
                },
            },
            dataLabels: {
                enabled: false,
            },
            xaxis: {
                categories: [
                    "Anakin",
                    "Barry Allen",
                    "Kal-El",
                    "Logan",
                    "Padmé",
                ],
            },
        },
    });

    return (
        <ReactApexChart
            options={state.options}
            series={state.series}
            type="bar"
            height={240}
        />
    );
}

export default BarChart;
