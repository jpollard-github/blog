FROM jpollard91/payara-mysql-8

COPY .env ${SCRIPT_DIR}/.env

COPY docker/create_jdbc_elements.sh ${SCRIPT_DIR}/create_jdbc_elements.sh
COPY docker/entrypoint.sh ${SCRIPT_DIR}/entrypoint.sh

COPY ./target/blog.war $DEPLOY_DIR
