sudo apt-get update
sudo apt-get install -y debconf-utils
export DEBIAN_FRONTEND="noninteractive"
sudo debconf-set-selections <<< "mysql-server mysql-server/root_password password rootpw"
sudo debconf-set-selections <<< "mysql-server mysql-server/root_password_again password rootpw"
sudo apt-get install -y mysql-server
sudo service mysql start
echo "create database grocery" | mysql -uroot -prootpw
