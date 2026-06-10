import React from "react";
import ReactApexChart from "react-apexcharts";

function DonutChart() {
    const [state, _] = React.useState({
        series: [477138, 499928, 444867, 220426, 473088],
        options: {
            chart: {
                type: "donut" as const,
            },
            labels: [
                "Anakin",
                "Barry Allen",
                "Kal-El",
                "Logan",
                "Padmé",
            ],
            responsive: [
                {
                    breakpoint: 480,
                    options: {
                        chart: {
                            width: 200,
                        },
                        legend: {
                            show: true,
                            position: "bottom",
                        },
                    },
                } as any,
            ],
        },
    });

    return (
        <ReactApexChart
            options={state.options}
            series={state.series}
            type="donut"
            height={240}
        />
    );
}

export default DonutChart;
