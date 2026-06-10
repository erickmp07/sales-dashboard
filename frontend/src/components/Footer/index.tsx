function Footer() {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">
                    App developed by{" "}
                    <a
                        href="https://github.com/erickmp07"
                        target="_blank"
                        rel="noreferrer"
                    >
                        Erick Macedo Pinto
                    </a>
                </p>
                <p className="text-light">
                    <small>
                        <strong>React + Spring Boot</strong>
                        <br />
                        Evento promovido pela escola DevSuperior:{" "}
                        <a
                            href="https://instagram.com/devsuperior.ig"
                            target="_blank"
                            rel="noreferrer"
                        >
                            @devsuperior.ig
                        </a>
                    </small>
                </p>
            </div>
        </footer>
    );
}

export default Footer;
