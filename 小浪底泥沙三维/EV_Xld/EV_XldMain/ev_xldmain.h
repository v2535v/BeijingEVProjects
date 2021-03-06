#ifndef EV_XLDMAIN_H
#define EV_XLDMAIN_H

#include <QtGui/QMainWindow>
#include "ui_ev_xldmain.h"
#include "QStandardItemModel"
#include "QString"

class EV_XldMain : public QMainWindow
{
	Q_OBJECT

public:
	EV_XldMain(QWidget *parent = 0, Qt::WFlags flags = 0);
	~EV_XldMain();
	public slots:
		void ReadGrd();
		void GrdToTiff();
		void GrdToLOD();
		void GrdToRenderTerrain();
		void slotGlobeOpened(GlobeWidget* globeWidget);
		void SliderValueChanged(int value);
		void GrdVisible(int g);
		void DrawRect();
		void DrawPolyline();
		void RenderWater();
		void IncreaseWater();
		void DecreaseWater();
		void ShowWater();
		void HideWater();
		void DeleteWater();
		void EV_XldMain::treeViewSelected(QTreeWidgetItem *item, int column);
		void WriteProjectStencil();
		void RenderProjectStencil();

private:
	Ui::EV_XldMainClass ui;
	QStandardItemModel* model;
	QString currrentName;
	static int waterHeight;
};

#endif // EV_XLDMAIN_H
